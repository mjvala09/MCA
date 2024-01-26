package com.example.videocapture20231012

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class ImageCapture20231012 : AppCompatActivity() {

    lateinit var img : ImageView
    lateinit var btnimg : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_capture20231012)

        img = findViewById(R.id.img)
        btnimg = findViewById(R.id.imgbtn)

        btnimg.setOnClickListener {
            var img = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(img,10000)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null){
            var imageBitmap = data.extras?.get("data") as Bitmap
            img.setImageBitmap(imageBitmap)
        }else{
            Toast.makeText(this,"image not captured",Toast.LENGTH_LONG).show()
        }
    }
}