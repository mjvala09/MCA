package com.example.fullandroidsyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            Thread(Runnable {
                Thread.sleep(100)
                val i = Intent(this,MenuActivity::class.java)
                startActivity(i)
            }).start()
        },3000)
    }
}