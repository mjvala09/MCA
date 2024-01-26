package com.example.cia_2_exam_set_b_android

import android.content.ContentValues
import android.content.DialogInterface
import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class DataBase : AppCompatActivity() {

    lateinit var rs : Cursor
    lateinit var et_name : EditText
    lateinit var et_sem : EditText
    lateinit var et_city : EditText
    lateinit var btn_insert : Button
    lateinit var btn_delete : Button
    lateinit var btn_rg :Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_base)

        et_name = findViewById(R.id.ed_name)
        et_sem = findViewById(R.id.ed_sem)
        et_city = findViewById(R.id.ed_city)
        btn_insert = findViewById(R.id.btn_insert)
        btn_delete = findViewById(R.id.btn_delete)
        btn_rg = findViewById(R.id.btn_rg)

        var helper : MyDBHelper = MyDBHelper(applicationContext)
        var db = helper.writableDatabase
        rs =db.rawQuery("SELECT SID _id, SNAME, SEM,CITY FROM STUDENT",null)


        btn_insert.setOnClickListener {
            var cv = ContentValues()
            cv.put("SNAME",et_name.text.toString())
            cv.put("SEM",et_sem.text.toString())
            db.insert("STUDENT",null,cv)
            db.rawQuery("SELECT SID _id,SNAME,SEM ,CITY FROM STUDENT",null)
            showMessage("Data Inserted")
            clear()
        }

        btn_delete.setOnClickListener {
            db.delete("STUDENT","SID = ?", arrayOf(rs.getString(0)))
            db.rawQuery("SELECT SID _id,SNAME,SEM,CITY FROM STUDENT",null)
            showMessage("Data Deleted")
            clear()

        }
        btn_rg.setOnClickListener {
           var i =Intent(this,Camera::class.java)
            startActivity(i)
        }
    }

    private fun clear() {
        et_name.setText("")
        et_sem.setText("")
        et_city.setText("")
    }

    private fun showMessage(s : String) {
        AlertDialog.Builder(this)
            .setTitle("Success !!")
            .setMessage(s)
            .setPositiveButton("OK", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            .setNegativeButton("CANCEL",DialogInterface.OnClickListener { dialogInterface, i ->

            }).show()

    }
}