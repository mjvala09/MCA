package com.example.examdemo1

import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.*
import androidx.core.app.ActivityCompat

class UpdateRecord : AppCompatActivity() {

    lateinit var rs : Cursor
    lateinit var imageBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_record)

        var textName = findViewById<TextView>(R.id.textName)
        var textMobile = findViewById<TextView>(R.id.textMobile)
        var textEmail = findViewById<TextView>(R.id.textEmail)


        var name = findViewById<EditText>(R.id.updateName)
        var email = findViewById<EditText>(R.id.updateEmail)
        var mobile = findViewById<EditText>(R.id.updateMobile)
        var password = findViewById<EditText>(R.id.updatePassword)
        var createCertificate = findViewById<Button>(R.id.createCertificate)

        var helper : MyDbHelper = MyDbHelper(applicationContext)
        var db = helper.writableDatabase

        var intent : Intent = getIntent()
        var EMPID = intent.getStringExtra("EMPID")
        var cv = ContentValues()

        rs = db.rawQuery("SELECT EMPID as _id,NAME,MOBILE,EMAIL,PASSWORD FROM EMPLOYEE WHERE _id=?",
            arrayOf(EMPID.toString())
        )
        if (rs.moveToNext()){
            name.setText(rs.getString(1))
            email.setText(rs.getString(2))
            mobile.setText(rs.getString(3))
            password.setText(rs.getString(4))
        }

        findViewById<Button>(R.id.updateEmployee).setOnClickListener {
            cv.put("NAME",name.text.toString())
            cv.put("email",email.text.toString())
            cv.put("PASSWORD",password.text.toString())
            cv.put("MOBILE",mobile.text.toString())
            db.update("EMPLOYEE",cv,"EMPID=$EMPID",null)


            textName.textSize = 40f
            textName.setTextColor(Color.RED)
            textName.text = "${name.text.toString()}"



            textMobile.textSize = 40f
            textMobile.setTextColor(Color.RED)
            textMobile.text = "${mobile.text.toString()}"



            textEmail.textSize = 40f
            textEmail.setTextColor(Color.RED)
            textEmail.text = "${email.text.toString()}"



        }
        imageBtn = findViewById<Button>(R.id.captureImage)
        imageBtn.setOnClickListener {

            if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),1)
            }else{
                var i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(i,1001)
            }
        }

//      ContentProvider ::::::::
        textMobile.setOnClickListener {
            var uri = Uri.parse("tel:"+textMobile.text.toString())
            var i = Intent(Intent.ACTION_DIAL,uri)
            startActivity(i)
        }

        textEmail.setOnClickListener {
            var uri = Uri.parse("https://mail.google.com")
            var i = Intent(Intent.ACTION_VIEW,uri)
            startActivity(i)
        }


    }



    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            var i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(i,1001)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(data != null){
            var image = data.extras?.get("data") as Bitmap?
            var imageView = findViewById<ImageView>(R.id.imageViewCertificate)
            imageView.setImageBitmap(image)
        }
    }
}