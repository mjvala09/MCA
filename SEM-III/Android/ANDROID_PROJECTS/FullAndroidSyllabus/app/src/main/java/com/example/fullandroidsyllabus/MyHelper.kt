package com.example.fullandroidsyllabus

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyHelper(context : Context) : SQLiteOpenHelper(context, "EXAM", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE EXAMTABLE(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, NUMBER TEXT)")
    }
    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {}
}