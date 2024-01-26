package com.example.thebigbull

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pb = findViewById<ProgressBar>(R.id.progressBar)
        var count = 0
        Thread(Runnable{
            while (count <= 100){
                count += 1
                Thread.sleep(50)
                pb.setProgress(count)
            }
            if (count >= 100){
                var login = Intent(this, LoginActivity::class.java)
                startActivity(login)
            }
        }).start()


    }
}