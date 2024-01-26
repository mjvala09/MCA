package com.example.db20230925

import android.content.ContentValues
import android.content.DialogInterface
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.SearchView
import android.widget.SimpleCursorAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var sem : EditText
    lateinit var list : ListView

    lateinit var db : SQLiteDatabase
    lateinit var cv : ContentValues
    lateinit var rs : Cursor

    lateinit var showAll : Button
    lateinit var sv : SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var helper : MyDbHelper = MyDbHelper(applicationContext)
        db = helper.writableDatabase

//      EditText
        name = findViewById(R.id.name)
        sem = findViewById(R.id.sem)
        list = findViewById(R.id.list)

//      Button
        var btn_insert = findViewById<Button>(R.id.insert)
        var btn_update = findViewById<Button>(R.id.update)
        var btn_delete = findViewById<Button>(R.id.delete)
        var btn_clear = findViewById<Button>(R.id.clear)
        var btn_next = findViewById<Button>(R.id.next)
        var btn_prev = findViewById<Button>(R.id.prev)
        var btn_last = findViewById<Button>(R.id.last)
        var btn_first = findViewById<Button>(R.id.first)
        showAll = findViewById(R.id.show_all)
        sv = findViewById(R.id.sv)



        rs = db.rawQuery("SELECT ID AS _id,NAME,SEM FROM STUD25",null)

        if (rs.moveToFirst()){
            name.setText(rs.getString(1))
            sem.setText(rs.getString(2))
        }





        btn_insert.setOnClickListener {
            var cv = ContentValues()
            cv.put("NAME",name.text.toString())
            cv.put("SEM",sem.text.toString())
            db.insert("STUD25",null,cv)
            showMessage("Inserted...")
        }

        btn_update.setOnClickListener {
            cv = ContentValues()
            cv.put("NAME",name.text.toString())
            cv.put("SEM",sem.text.toString())
            db.update("STUD25",cv,"id=?", arrayOf(rs.getString(0)))
            showMessage("Updated...")
        }

        btn_delete.setOnClickListener {
            db.delete("STUD25","ID=?", arrayOf(rs.getString(0)))
            showMessage("Deleted...")
        }

        btn_first.setOnClickListener {
            if (rs.moveToFirst()){
                name.setText(rs.getString(1))
                sem.setText(rs.getString(2))
            }else{
                showMessage("No record found...")
            }
        }
        btn_last.setOnClickListener {
            if (rs.moveToLast()){
                name.setText(rs.getString(1))
                sem.setText(rs.getString(2))
            }else{
                showMessage("No record found...")
            }
        }
        btn_next.setOnClickListener {
            if (rs.moveToNext()){
                name.setText(rs.getString(1))
                sem.setText(rs.getString(2))
            }else if (rs.moveToFirst()){
                name.setText(rs.getString(1))
                sem.setText(rs.getString(2))
            }else{
                showMessage("No record found...")
            }
        }
        btn_prev.setOnClickListener {
            if (rs.moveToPrevious()){
                name.setText(rs.getString(1))
                sem.setText(rs.getString(2))
            }else if (rs.moveToLast()){
                name.setText(rs.getString(1))
                sem.setText(rs.getString(2))
            }else{
                showMessage("No record found...")
            }
        }

//        btn_clear.setOnClickListener {
//            clear()
//        }
        showAll.setOnClickListener {
            var adapter = SimpleCursorAdapter(applicationContext,
                android.R.layout.simple_list_item_2,
                rs,
                arrayOf("NAME","SEM"),
                intArrayOf(android.R.id.text1,android.R.id.text2),
                0
            )
            list.adapter =adapter

            sv.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(p0: String?): Boolean {
                    return false
                }

                override fun onQueryTextChange(p0: String?): Boolean {
                    rs = db.rawQuery("SELECT SID _ID,SNAME,SEM FROM STUDENT WHERE SNAME LIKE '%{p0}%' ",null)
                    adapter.changeCursor(rs)
                    return true
                }

            })

            btn_clear.setOnClickListener {
                clear()
            }
        }
    }

    private fun updateRS() {
        rs = db.rawQuery("SELECT ID as _id,NAME,SEM FROM STUD25",null)
        if (rs.moveToNext()){
            name.setText(rs.getString(1))
            sem.setText(rs.getString(2))
        }
        Toast.makeText(applicationContext,"Data refreshed",Toast.LENGTH_LONG).show()
    }

    private fun clear() {
        name.setText("")
        sem.setText("")
    }

    private fun showMessage(s : String) {
        AlertDialog.Builder(this)
            .setTitle("RESULT")
            .setMessage(s)
            .setPositiveButton("OK",DialogInterface.OnClickListener { dialogInterface, i ->
                updateRS()
            })
            .setNegativeButton("CANCEL",DialogInterface.OnClickListener { dialogInterface, i ->

            }).show()
    }
}