package com.example.crudexam

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView

class Topics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topics)

        var website = findViewById<TextView>(R.id.website)
        var dialpad = findViewById<TextView>(R.id.dialpad)
        var location = findViewById<TextView>(R.id.location)

        findViewById<Button>(R.id.browser).setOnClickListener {
            var uri = Uri.parse(website.text.toString())
            var i = Intent(Intent.ACTION_VIEW,uri)
            startActivity(i)
        }
        findViewById<Button>(R.id.call).setOnClickListener {
            var uri = Uri.parse("tel:" + dialpad.text)
            var i = Intent(Intent.ACTION_DIAL,uri)
            startActivity(i)
        }

        findViewById<Button>(R.id.map).setOnClickListener {
            var uri = Uri.parse("geo:0,0?q=" + location.text)
            var i = Intent(Intent.ACTION_VIEW,uri)
            startActivity(i)
        }

        findViewById<Button>(R.id.splash_screen).setOnClickListener {
            Handler().postDelayed({
                val i = Intent(this,SplashScreen::class.java)
                startActivity(i)
                finish()
            },2000)
        }





    }
}