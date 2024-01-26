package com.example.examdemo1

import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.VideoView
import androidx.core.app.ActivityCompat

class CaptureImage : AppCompatActivity() {

    lateinit var imageView : ImageView
    lateinit var videoView : VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture_image)

        imageView = findViewById<ImageView>(R.id.loginCaptureImageShow)
        videoView = findViewById<VideoView>(R.id.loginCaptureVideoShow)
        if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),222)
        }
        findViewById<Button>(R.id.imageBTN).setOnClickListener {
            startActivityForResult(Intent(MediaStore.ACTION_IMAGE_CAPTURE),555)
        }
        findViewById<Button>(R.id.videoBTN).setOnClickListener {
            startActivityForResult(Intent(MediaStore.ACTION_VIDEO_CAPTURE),666)
        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 222 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            startActivityForResult(Intent(MediaStore.ACTION_IMAGE_CAPTURE),111)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 555){
            if(data != null){
                var bitmap = data.extras?.get("data") as Bitmap?
                imageView.setImageBitmap(bitmap)
            }
        }
        if(requestCode == 666){
            if(data != null){
                videoView.setVideoURI(data.getData())
                videoView.start()
            }
        }
    }
}