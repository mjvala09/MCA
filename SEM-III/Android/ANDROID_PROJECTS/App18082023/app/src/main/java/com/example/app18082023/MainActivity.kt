package com.example.app18082023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var email=findViewById<EditText>(R.id.editTextTextEmailAddress)

        var btn=findViewById<Button>(R.id.button)
        btn.isEnabled = false

        email.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                btn.isEnabled = android.util.Patterns.EMAIL_ADDRESS.matcher(p0).matches()
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })
    }
}