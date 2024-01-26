package com.example.thebigbull

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignInButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_button)

        var name = findViewById<TextView>(R.id.signName)
        var mobile = findViewById<TextView>(R.id.signMobile)
        var email = findViewById<TextView>(R.id.signEmail)
        var date = findViewById<TextView>(R.id.signDate)
        var time = findViewById<TextView>(R.id.signTime)

        val i : Intent = intent

        var setname = i.getStringExtra("name")
        var setmobile = i.getStringExtra("mobile")
        var setemail = i.getStringExtra("email")
        var setdate = i.getStringExtra("date")
        var settime = i.getStringExtra("time")

        name.text = "Name : ${i.getStringExtra("name")}"
        mobile.text = "Mobile : ${setmobile.toString()}"
        email.text = "Email : ${setemail.toString()}"
        date.text = "Date : ${setdate.toString()}"
        time.text = "Time : ${settime.toString()}"


    }
}