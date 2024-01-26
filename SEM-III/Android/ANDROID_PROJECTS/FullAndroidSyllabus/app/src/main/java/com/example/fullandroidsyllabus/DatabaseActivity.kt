package com.example.fullandroidsyllabus

import android.content.ContentValues
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.SearchView
import android.widget.SimpleCursorAdapter
import android.widget.Toast

class DatabaseActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var number : EditText
    lateinit var rs : Cursor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database)

        name = findViewById(R.id.nameDB)
        number = findViewById(R.id.numberDB)

        var helper : MyHelper = MyHelper(applicationContext)
        var db = helper.writableDatabase
        rs = db.rawQuery("SELECT ID _id, NAME, NUMBER FROM EXAMTABLE",null)

        findViewById<Button>(R.id.insertDB).setOnClickListener {
            var cv = ContentValues()
            cv.put("NAME", name.text.toString())
            cv.put("NUMBER", number.text.toString())
            db.insert("EXAMTABLE", null, cv)
            Toast.makeText(applicationContext, "INSERTED", Toast.LENGTH_LONG).show()
            rs = db.rawQuery("SELECT ID _id, NAME, NUMBER FROM EXAMTABLE",null)
        }
        findViewById<Button>(R.id.updateDB).setOnClickListener {
            var cv = ContentValues()
            cv.put("NAME",name.text.toString())
            cv.put("NUMBER",number.text.toString())
            db.update("EXAMTABLE", cv, "ID=?", arrayOf(rs.getString(0)))
            Toast.makeText(applicationContext, "UPDATED", Toast.LENGTH_LONG).show()
            rs = db.rawQuery("SELECT ID _id, NAME, NUMBER FROM EXAMTABLE",null)
        }
        findViewById<Button>(R.id.deleteDB).setOnClickListener {
            db.delete("EXAMTABLE", "ID=?", arrayOf(rs.getString(0)))
            Toast.makeText(applicationContext, "DELETED", Toast.LENGTH_LONG).show()
            rs = db.rawQuery("SELECT ID _id, NAME, NUMBER FROM EXAMTABLE",null)
        }
        findViewById<Button>(R.id.clearDB).setOnClickListener {
            clearField()
            Toast.makeText(applicationContext, "CLEARED", Toast.LENGTH_LONG).show()
        }
        findViewById<Button>(R.id.firstDB).setOnClickListener {
            if(rs.moveToFirst()){
                name.setText(rs.getString(1))
                number.setText(rs.getString(2))
            }
        }
        findViewById<Button>(R.id.previousDB).setOnClickListener {
            if(rs.moveToPrevious()){
                name.setText(rs.getString(1))
                number.setText(rs.getString(2))
            }else if(rs.moveToLast()){
                name.setText(rs.getString(1))
                number.setText(rs.getString(2))
            }else{
                Toast.makeText(applicationContext, "Table is Empty!", Toast.LENGTH_LONG).show()
            }
        }
        findViewById<Button>(R.id.nextDB).setOnClickListener {
            if(rs.moveToNext()){
                name.setText(rs.getString(1))
                number.setText(rs.getString(2))
            }else if(rs.moveToFirst()){
                name.setText(rs.getString(1))
                number.setText(rs.getString(2))
            }else{
                Toast.makeText(applicationContext, "Table is Empty!", Toast.LENGTH_LONG).show()
            }
        }
        findViewById<Button>(R.id.lastDB).setOnClickListener {
            if(rs.moveToLast()){
                name.setText(rs.getString(1))
                number.setText(rs.getString(2))
            }
        }
        var listDB = findViewById<ListView>(R.id.listDB)
        findViewById<Button>(R.id.showAllDB).setOnClickListener {
            rs = db.rawQuery("SELECT ID _id, NAME, NUMBER FROM EXAMTABLE",null)
            var adapter = SimpleCursorAdapter(applicationContext, android.R.layout.simple_list_item_2,rs,
                arrayOf("NAME","NUMBER"), intArrayOf(android.R.id.text1, android.R.id.text2),0
            )
            listDB.adapter = adapter

            findViewById<SearchView>(R.id.searchDB).setOnQueryTextListener(object : SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(p0: String?): Boolean {
                    return false
                }
                override fun onQueryTextChange(p0: String?): Boolean {
                    rs = db.rawQuery("SELECT ID _id, NAME, NUMBER FROM EXAMTABLE WHERE NAME LIKE '%$p0%' OR NUMBER LIKE '%$p0%'", null)
                    adapter.changeCursor(rs)
                    return false
                }
            })
        }
    }

    private fun clearField() {
        name.setText("")
        number.setText("")
    }
}