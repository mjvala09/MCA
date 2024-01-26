package com.example.employeemanager20231014

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(context : Context) : SQLiteOpenHelper(context,"EMPLOYEEMANAGEMENT",null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL(
"CREATE TABLE EMPLOYEEMANAGEMENT(USER_ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,EMAIL TEXT,PASSWORD TEXT)"
        )
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}