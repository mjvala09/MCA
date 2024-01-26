package com.example.examdemo1

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import android.widget.Toast
import com.google.android.gms.analytics.ecommerce.Product

class EmployeeList : AppCompatActivity() {

    lateinit var rs : Cursor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_list)

        var listEmployee = findViewById<ListView>(R.id.list_employee)
        var helper : MyDbHelper = MyDbHelper(applicationContext)
        var db = helper.readableDatabase

        rs = db.rawQuery("SELECT EMPID as _id,NAME,MOBILE FROM EMPLOYEE",null)
        var adapter = SimpleCursorAdapter(applicationContext,android.R.layout.simple_list_item_2,rs,
            arrayOf("NAME","MOBILE"),
            intArrayOf(android.R.id.text1,android.R.id.text2),0)
        listEmployee.adapter = adapter

        listEmployee.setOnItemClickListener { adapterView, view, i, l ->
            var value = listEmployee.getItemIdAtPosition(i)
            rs = db.rawQuery("SELECT EMPID as _id,NAME,MOBILE FROM EMPLOYEE WHERE _id=?",
                arrayOf(value.toString())
            )
            if(rs.moveToNext()){
                var ad = AlertDialog.Builder(this)
                var itemName = rs.getString(1)
                ad.setTitle("${rs.getString(0)}\n${rs.getString(1)}")
                ad.setMessage(rs.getString(2))

                ad.setPositiveButton("UPDATE",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        var i = Intent(this,UpdateRecord::class.java)
                        i.putExtra("EMPID",rs.getString(0))
                        startActivity(i)
                    })
                ad.setNegativeButton("DELETE",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        rs = db.rawQuery("SELECT EMPID as _id,NAME,MOBILE FROM EMPLOYEE WHERE _id=?",
                            arrayOf(rs.getString(0))
                        )
                        if(rs.moveToNext()){
                            db.delete("EMPLOYEE","NAME=?", arrayOf(rs.getString(1)))
                            rs = db.rawQuery("SELECT EMPID as _id,NAME,MOBILE FROM EMPLOYEE",null)
                            adapter.changeCursor(rs)
                        }
                    })
                ad.show()
            }
        }


    }
}