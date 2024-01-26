package com.example.fullandroidsyllabus

import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityCompat

class ImageCapture : AppCompatActivity() {

    lateinit var capture : Button
    lateinit var imageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_capture)

        capture = findViewById(R.id.imageBTN)
        capture.isEnabled = false

        if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),103)
        }else{
            capture.isEnabled = true
        }

        capture.setOnClickListener {
            startActivityForResult(Intent(MediaStore.ACTION_IMAGE_CAPTURE),104)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 104){
            if(data != null){
//                var pic = data?.getParcelableExtra<Bitmap>("data")
                var pic = data.extras?.get("data") as Bitmap?
                imageView = findViewById(R.id.imageView)
                imageView.setImageBitmap(pic)
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 103 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            capture.isEnabled = true
        }
    }
}