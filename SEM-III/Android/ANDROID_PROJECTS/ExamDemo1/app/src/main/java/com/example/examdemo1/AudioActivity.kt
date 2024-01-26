package com.example.examdemo1

import android.content.pm.PackageManager
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import androidx.core.app.ActivityCompat
import java.io.File

class AudioActivity : AppCompatActivity() {

    lateinit var path : Uri
    lateinit var mp : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)

        if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(
                android.Manifest.permission.READ_EXTERNAL_STORAGE,
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE,
                android.Manifest.permission.WAKE_LOCK
            ),555)
        }else{
            playAudio()
        }



        findViewById<Button>(R.id.playAudio).setOnClickListener {
            mp.start()
        }
        findViewById<Button>(R.id.pauseAudio).setOnClickListener {
            mp.pause()
        }
        findViewById<Button>(R.id.stopAudio).setOnClickListener {
            mp.stop()
            playAudio()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 555 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            playAudio()
        }
    }

    private fun playAudio() {
        path = Uri.parse("file:///storage/emulated/0/Download/xyz.mp3")
        mp = MediaPlayer()
        mp.setDataSource(applicationContext, path)
        mp.prepare()
    }
}