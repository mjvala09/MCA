package com.example.db20230923

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var sem : EditText
    lateinit var lv : ListView
    lateinit var db : SQLiteDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            name = findViewById(R.id.name)
            sem = findViewById(R.id.sem)
            lv = findViewById(R.id.list)

            var helper : MyDbHelper = MyDbHelper(applicationContext)
            db = helper.writableDatabase

            var rs = db.rawQuery("SELECT ROLL,NAME,SEMESTER FROM MCASEM3",null)
            if(rs.moveToFirst()){
                name.setText(rs.getString(1))
                sem.setText(rs.getString(2))
            }
        findViewById<Button>(R.id.insert).setOnClickListener {
            var cv = ContentValues()
            cv.put("name",name.text.toString())
            cv.put("semester",sem.text.toString())
            db.insert("MCASEM3",null,cv)
            showAllDato()
        }
        findViewById<Button>(R.id.delete_all).setOnClickListener {
            db.delete("MCASEM3",null,null)
            db.execSQL("UPDATE SQLITE_SEQUENCE SET SEQ=0 WHERE NAME='MCASEM3'")
            showAllDato()
        }

        findViewById<Button>(R.id.clear).setOnClickListener {
            clear()
        }
        findViewById<Button>(R.id.show_all).setOnClickListener {
            showAllDato()
        }
        showAllDato()

    }

    private fun showAllDato() {
        var rs = db.rawQuery("SELECT ROLL,NAME,SEMESTER FROM MCASEM3",null)
        var records = ArrayList<String>()
        while (rs.moveToNext()){
            records.add("${rs.getString(0)}  ${rs.getString(1)}  ${rs.getString(2)}")
        }
        lv.adapter = ArrayAdapter<String>(applicationContext,android.R.layout.simple_list_item_1,records)
    }

    private fun clear() {
        name.text.clear()
        sem.text.clear()
    }
}