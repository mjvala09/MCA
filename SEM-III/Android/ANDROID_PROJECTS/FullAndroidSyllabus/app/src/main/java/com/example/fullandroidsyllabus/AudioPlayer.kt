package com.example.fullandroidsyllabus

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat

class AudioPlayer : AppCompatActivity() {

    lateinit var mp : MediaPlayer

    @RequiresApi(34)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_player)

        mp = MediaPlayer.create(applicationContext, R.raw.ramsiyaram)
        findViewById<Button>(R.id.playBTN).setOnClickListener {
            mp.start()
        }
        findViewById<Button>(R.id.pauseBTN).setOnClickListener {
            mp.pause()
        }
        findViewById<Button>(R.id.resumeBTN).setOnClickListener {
            mp.start()
        }
        findViewById<Button>(R.id.stopBTN).setOnClickListener {
            mp.stop()
        }
    }
}