package com.example.audioplaystop20231011

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var mp : MediaPlayer
    lateinit var onMP : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mp = MediaPlayer.create(this,R.raw.ramsiyaram)
        onMP = MediaPlayer()

        findViewById<Button>(R.id.onlinePlay).setOnClickListener {
            onMP.setDataSource(
                this,
                Uri.parse("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3")
            )
            onMP.prepare()
            onMP.start()
        }
        findViewById<Button>(R.id.onlineStop).setOnClickListener {
            onMP.stop()
        }
        findViewById<Button>(R.id.offlinePlay).setOnClickListener {
            mp.start()
        }
        findViewById<Button>(R.id.offlineStop).setOnClickListener {
            mp.stop()
        }
        findViewById<Button>(R.id.pause).setOnClickListener {
            mp.pause()
        }
    }
}