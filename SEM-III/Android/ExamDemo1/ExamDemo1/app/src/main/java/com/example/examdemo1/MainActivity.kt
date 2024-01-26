package com.example.examdemo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            Thread(Runnable {
                var count = 0
                while (count <= 100){
                    Thread.sleep(10)
                    findViewById<ProgressBar>(R.id.progressBar).setProgress(count)
                    count += 1
                }
                if(count >= 100){
                    count = 0
                    startActivity(Intent(this,LoginActivity::class.java))
                }
            }).start()
        },1000)
    }
}