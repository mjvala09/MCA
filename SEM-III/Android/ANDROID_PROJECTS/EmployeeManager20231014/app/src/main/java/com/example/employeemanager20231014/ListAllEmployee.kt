package com.example.employeemanager20231014

import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SimpleCursorAdapter

class ListAllEmployee : AppCompatActivity() {

    lateinit var employee_list : ListView
    lateinit var rs : Cursor


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_all_employee)

        employee_list = findViewById(R.id.employee_list)

        var helper : MyDbHelper = MyDbHelper(applicationContext)
        var db = helper.writableDatabase
        rs = db.rawQuery("SELECT USER_ID AS _id,NAME FROM EMPLOYEEMANAGEMENT",null)
        var adapter = SimpleCursorAdapter(applicationContext, android.R.layout.simple_list_item_2,rs,arrayOf("_id","NAME"),intArrayOf(android.R.id.text1,android.R.id.text2),)
        employee_list.adapter = adapter


    }
}