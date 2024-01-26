package com.example.examdemo1

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(context : Context) : SQLiteOpenHelper(context,"EmployeeDB",null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE EMPLOYEE(EMPID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,MOBILE NUMBER,EMAIL TEXT,PASSWORD TEXT)")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}