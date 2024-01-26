package com.example.employeemanager20231014

import android.content.ContentValues
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterEmplyee : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var email : EditText
    lateinit var password : EditText
    lateinit var register : Button
    lateinit var rs : Cursor
    lateinit var db : SQLiteDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_emplyee)

        name = findViewById(R.id.rname)
        email = findViewById(R.id.remail)
        password = findViewById(R.id.rpassword)
        register = findViewById(R.id.rregister)

        var helper : MyDbHelper = MyDbHelper(applicationContext)
        db = helper.writableDatabase

        register.setOnClickListener {
            if(android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches()){
//                Toast.makeText(this,"hii",Toast.LENGTH_LONG).show()
                if(name.text.length >= 5 && password.text.length >= 8){
                    rs = db.rawQuery("SELECT EMAIL,PASSWORD FROM EMPLOYEEMANAGEMENT WHERE EMAIL=?", arrayOf(email.text.toString()))

                    if(rs.moveToNext()){
                        Toast.makeText(this,"first",Toast.LENGTH_LONG).show()
//                        var cursor_name = rs.getString(rs.getColumnIndexOrThrow("EMAIL"))
//                        if(true){
//                            Toast.makeText(this,"hii",Toast.LENGTH_LONG).show()
////                            var i = Intent(this@RegisterEmplyee, ListAllEmployee::class.java)
////                            startActivity(i)
////                            var cv = ContentValues()
////                            cv.put("NAME",name.text.toString())
////                            cv.put("EMAIL",email.text.toString())
////                            cv.put("PASSWORD",password.text.toString())
////                            db.insert("EMPLOYEEMANAGEMENT",null,cv)
//                        }else{
//                            Toast.makeText(this,"no hii",Toast.LENGTH_LONG).show()
//                        }
                    }
                }else{
                    name.setError("Enter minimum 5 character")
                    password.setError("Enter minimum 8 character")
                }
            }else{
                email.setError("Enter valid email address")
            }
        }

    }
}