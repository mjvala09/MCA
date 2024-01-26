package com.example.crudexam

import android.content.ContentValues
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.SearchView
import android.widget.SimpleCursorAdapter
import android.widget.TextView
import android.widget.Toast
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var college : EditText
    lateinit var listView : ListView
    lateinit var searchView : SearchView
    lateinit var rs : Cursor
    lateinit var cv : ContentValues
    lateinit var db : SQLiteDatabase
    lateinit var fileData : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        college = findViewById(R.id.college)
        searchView = findViewById(R.id.searchView)
        fileData = findViewById(R.id.fileData)

        findViewById<Button>(R.id.all_operation).setOnClickListener {
            var i = Intent(this,Topics::class.java)
            startActivity(i)
        }

        findViewById<Button>(R.id.save_in_file).setOnClickListener {
            var fop = openFileOutput("laterUse", MODE_PRIVATE)
            fop.write(name.text.toString().toByteArray())
            Toast.makeText(applicationContext,"Saved",Toast.LENGTH_LONG).show()
        }
        findViewById<Button>(R.id.show_file_data).setOnClickListener {
            var line : String? = ""
            var fip = openFileInput("laterUse")
            var br = BufferedReader(InputStreamReader(fip))
            while(line != null){
                line = br.readLine()
                if(line != null){
                    fileData.append(line + "\n")
                }
            }
        }


        var helper : MyDbHelper = MyDbHelper(applicationContext)
        db = helper.writableDatabase
        rs = db.rawQuery("SELECT ID as _id,NAME,COLLEGE FROM STUDENTDETO",null)


            findViewById<Button>(R.id.insert).setOnClickListener {
            cv = ContentValues()
            cv.put("NAME",name.text.toString())
            cv.put("COLLEGE",college.text.toString())
            db.insert("STUDENTDETO",null,cv)
            updateList()
            Toast.makeText(applicationContext,"Inserted",Toast.LENGTH_LONG).show()
        }
        findViewById<Button>(R.id.update).setOnClickListener {
            cv = ContentValues()
            cv.put("NAME",name.text.toString())
            cv.put("COLLEGE",college.text.toString())
            db.update("STUDENTDETO",cv,"ID=?", arrayOf(rs.getString(0)))
            Toast.makeText(applicationContext,"Updated",Toast.LENGTH_LONG).show()
        }
        findViewById<Button>(R.id.delete).setOnClickListener {
            db.delete("STUDENTDETO","ID=?", arrayOf(rs.getString(0)))
            updateList()
            clearFields()
            Toast.makeText(applicationContext,"Deleted",Toast.LENGTH_LONG).show()
        }
        findViewById<Button>(R.id.clear).setOnClickListener {
            clearFields()
        }
        findViewById<Button>(R.id.previus).setOnClickListener {
            if(rs.moveToPrevious()){
                name.setText(rs.getString(1))
                college.setText(rs.getString(2))
            }else if(rs.moveToLast()){
                name.setText(rs.getString(1))
                college.setText(rs.getString(2))
            }
        }
        findViewById<Button>(R.id.next).setOnClickListener {
            if(rs.moveToNext()){
                name.setText(rs.getString(1))
                college.setText(rs.getString(2))
            }else if(rs.moveToFirst()){
                name.setText(rs.getString(1))
                college.setText(rs.getString(2))
            }
        }
        findViewById<Button>(R.id.first).setOnClickListener {
            if(rs.moveToFirst()){
                name.setText(rs.getString(1))
                college.setText(rs.getString(2))
            }
        }
        findViewById<Button>(R.id.last).setOnClickListener {
            if(rs.moveToLast()){
                name.setText(rs.getString(1))
                college.setText(rs.getString(2))
            }
        }
        findViewById<Button>(R.id.showAll).setOnClickListener {
            var adapter = SimpleCursorAdapter(applicationContext,android.R.layout.simple_list_item_2,rs,arrayOf("NAME","COLLEGE"),intArrayOf(android.R.id.text1,android.R.id.text2),0)
            listView = findViewById(R.id.showAllList)
            listView.adapter = adapter

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(p0: String?): Boolean {
                    return false
                }

                override fun onQueryTextChange(p0: String?): Boolean {
                    rs = db.rawQuery("SELECT ID as _id,NAME,COLLEGE FROM STUDENTDETO WHERE NAME LIKE '%${p0}%'",null)
                    adapter.changeCursor(rs)
                    return true
                }

            })

        }
    }

    private fun updateList() {
        rs = db.rawQuery("SELECT ID as _id,NAME,COLLEGE FROM STUDENTDETO",null)

        var adapter = SimpleCursorAdapter(applicationContext,android.R.layout.simple_list_item_2,rs,arrayOf("NAME","COLLEGE"),intArrayOf(android.R.id.text1,android.R.id.text2),0)
        listView = findViewById(R.id.showAllList)
        listView.adapter = adapter

    }

    private fun clearFields() {
        name.setText("")
        college.setText("")
    }
}