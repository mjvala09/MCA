package com.example.examdemo1

import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.system.exitProcess

class LoginActivity : AppCompatActivity() {

    lateinit var rs : Cursor
    lateinit var email : EditText
    lateinit var password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById(R.id.username)
        password = findViewById(R.id.login_password)

        var helper : MyDbHelper = MyDbHelper(applicationContext)
        var db = helper.readableDatabase



        findViewById<Button>(R.id.register).setOnClickListener {
            var i = Intent(this,RegisterEmployee::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.login).setOnClickListener {
            rs = db.rawQuery("SELECT EMAIL,PASSWORD FROM EMPLOYEE WHERE EMAIL=?",   arrayOf("${email.text.toString()}"))
            if(rs.moveToNext()){
                if(rs.getString(0) == email.text.toString() && rs.getString(1) == password.text.toString()){
                    var i = Intent(this,EmployeeList::class.java)
                    startActivity(i)
                }
            }
        }
    }
}