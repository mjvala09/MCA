package com.example.app17082023

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button)
        var email_valid = findViewById<EditText>(R.id.editTextTextEmailAddress)
        btn.isEnabled = false
        email_valid.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                btn.isEnabled = android.util.Patterns.EMAIL_ADDRESS.matcher(p0).matches()
                if(btn.isEnabled == false){
                    email_valid.setError("Not Valid")
                }
            }
            override fun afterTextChanged(p0: Editable?) {

            }

        })

        var dt : EditText = findViewById(R.id.editTextDate)
        var tm : EditText = findViewById(R.id.editTextTime)

        dt.setOnClickListener {
            DatePickerDialog(this, DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
                dt.setText("$day/${month+1}/$year")
            },2023,8,17).show()
        }
        tm.setOnClickListener {
            TimePickerDialog(this,TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                tm.setText("$hour : $minute")
            },10,10,false).show()
        }

    }
}