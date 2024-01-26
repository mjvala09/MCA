package com.example.crudexam

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(context : Context) : SQLiteOpenHelper(context, "STUDENT",null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE STUDENTDETO(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,COLLEGE TEXT)")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}