package com.example.app20230920

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var email = findViewById<EditText>(R.id.email)
        var register = findViewById<Button>(R.id.register)
        var login = findViewById<Button>(R.id.login)
        var user_id = findViewById<EditText>(R.id.user_id)
        var gender = findViewById<RadioGroup>(R.id.gender)
        var city = findViewById<AutoCompleteTextView>(R.id.auto)

        var sp = application.getSharedPreferences("register_details", MODE_PRIVATE)
        var editor = sp.edit()

        gender.setOnCheckedChangeListener { radioGroup, i ->
            var getGender = findViewById<RadioButton>(i)
            editor.putString("gender",getGender.text.toString())
        }

        var cities = arrayOf("Somnath","Rajkot","Ahmedabad","Vadodara")
        var adapter = ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,cities)
        city.setAdapter(adapter)

        register.setOnClickListener {
            editor.putString("user_id",user_id.text.toString())
            editor.putString("email",email.text.toString())
            editor.putString("city",city.text.toString())
            editor.commit()
            var conn : MyDbHelper = MyDbHelper(this.applicationContext)
            conn.writableDatabase
            Toast.makeText(applicationContext,"registered",Toast.LENGTH_LONG).show()
        }



    }
}