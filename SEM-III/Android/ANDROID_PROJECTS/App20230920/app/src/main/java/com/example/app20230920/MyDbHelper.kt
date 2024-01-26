package com.example.app20230920

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(context : Context): SQLiteOpenHelper(context,"STUDENT_DB",null,1){
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE STUDENT(USER_ID INTEGER PRIMARY KEY AUTOINCREMENT,EMAIL TEXT,PASSWORD TEXT,GENDER VARCHAR)")
        p0?.execSQL("INSERT INTO STUDENT VALUES(NULL,'MANOJ@MANOJ.MANOJ','PASSWORD','MALE')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}