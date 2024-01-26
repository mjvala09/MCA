package com.example.employeemanager20231014

import android.content.ContentValues
import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var email : EditText
    lateinit var password : EditText
    lateinit var login : Button
    lateinit var register : Button
    lateinit var rs : Cursor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.contentProvider).setOnClickListener {
            var i = Intent(this,ContentReader::class.java)
            startActivity(i)
        }

        var helper : MyDbHelper =  MyDbHelper(applicationContext)
        var db = helper.writableDatabase

        register = findViewById(R.id.lregister)
        login = findViewById<Button>(R.id.llogin)
        login.isEnabled = false
        password = findViewById(R.id.lpassword)
        password.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                login.isEnabled = (p0.toString() == "")
                login.isEnabled = (p0.toString().length >= 8)
            }

        })

        email = findViewById(R.id.lemail)

        login.setOnClickListener {
            if (android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches()){
                rs = db.rawQuery("SELECT EMAIL,PASSWORD FROM EMPLOYEEMANAGEMENT WHERE EMAIL=?", arrayOf(email.text.toString()))
                if(rs.moveToNext()){
                    var cursor_name = rs.getString(rs.getColumnIndexOrThrow("EMAIL"))
                    var cursor_password = rs.getString(rs.getColumnIndexOrThrow("PASSWORD"))
                    if(cursor_name.toString().equals(email.text.toString())){
                        if(cursor_password.toString().equals(password.text.toString())){
                            var i = Intent(this, ListAllEmployee::class.java)
                            startActivity(i)
                        }
                    }else{
                        Toast.makeText(this,"Username or password is incorrect",Toast.LENGTH_LONG).show()
                        var i = Intent(this, MainActivity::class.java)
                        startActivity(i)
                    }
                }
            }else{
                email.setError("Enter a valid email address!")
            }


        }
        register.setOnClickListener {
            var i = Intent(this, RegisterEmplyee::class.java)
            startActivity(i)
        }

    }
}