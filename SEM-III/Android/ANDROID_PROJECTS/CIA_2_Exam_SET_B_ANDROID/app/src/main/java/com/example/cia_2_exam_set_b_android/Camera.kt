package com.example.cia_2_exam_set_b_android

import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.app.ActivityCompat

class Camera : AppCompatActivity() {

    lateinit var iv :ImageView
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        iv = findViewById(R.id.imageView2)
        btn = findViewById(R.id.button)

        if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),111)
        }
        btn.setOnClickListener {
            var intent =Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,101)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(data!=null){
            val imageBitmap = data.extras?.get("data")as Bitmap
            iv.setImageBitmap(imageBitmap)
        }else{
            Toast.makeText(applicationContext,"image not captured",Toast.LENGTH_LONG).show()
        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==111 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
            Toast.makeText(applicationContext,"camera permission captured",Toast.LENGTH_LONG).show()
        }

    }
}