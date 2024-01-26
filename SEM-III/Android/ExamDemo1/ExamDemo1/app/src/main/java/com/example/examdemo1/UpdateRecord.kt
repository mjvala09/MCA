package com.example.examdemo1

import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.core.app.ActivityCompat

class UpdateRecord : AppCompatActivity() {

    lateinit var rs : Cursor
    lateinit var imageBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_record)

        var name = findViewById<EditText>(R.id.updateName)
        var email = findViewById<EditText>(R.id.updateEmail)
        var mobile = findViewById<EditText>(R.id.updateMobile)
        var password = findViewById<EditText>(R.id.updatePassword)

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
            var i = Intent(this,EmployeeList::class.java)
            startActivity(i)
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
            var image = data.extras?.get("data") as Bitmap
            var imageView = findViewById<ImageView>(R.id.imageViewCertificate)
            imageView.setImageBitmap(image)
        }
    }
}