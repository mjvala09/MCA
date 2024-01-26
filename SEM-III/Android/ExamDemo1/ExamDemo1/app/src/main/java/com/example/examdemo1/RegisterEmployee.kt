package com.example.examdemo1

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.ContentValues
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.time.LocalDateTime
import java.util.Calendar
import java.util.Date

class RegisterEmployee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_employee)

        var helper : MyDbHelper = MyDbHelper(applicationContext)
        var db = helper.writableDatabase

        var name = findViewById<EditText>(R.id.name)
        var mobile = findViewById<EditText>(R.id.mobile)
        var email = findViewById<EditText>(R.id.email)
        var date = findViewById<EditText>(R.id.date)
        var password = findViewById<EditText>(R.id.password)

        findViewById<Button>(R.id.registerEmployee).setOnClickListener {
            var cv = ContentValues()
            cv.put("NAME",name.text.toString())
            cv.put("MOBILE",mobile.text.toString())
            cv.put("EMAIL",email.text.toString())
            cv.put("PASSWORD",password.text.toString())
            db.insert("EMPLOYEE",null,cv)

            var i = Intent(this,LoginActivity::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.clearRegister).setOnClickListener {
            name.setText("")
            email.setText("")
            mobile.setText("")
            password.setText("")
        }
        var c = Calendar.getInstance()
        date.setOnClickListener {
            DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
                    var dt = "$day/${month+1}/$year"
                    TimePickerDialog(this,
                        TimePickerDialog.OnTimeSetListener { timePicker, hour, min ->
                            dt += "  $hour:$min"
                            date.setText("$dt")
                        },c.get(Calendar.HOUR),c.get(Calendar.MINUTE),false
                        ).show()
                },c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)
            ).show()
        }



    }
}