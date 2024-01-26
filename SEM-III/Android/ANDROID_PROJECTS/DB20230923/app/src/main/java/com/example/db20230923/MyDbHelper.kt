package com.example.db20230923

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(context: Context?) : SQLiteOpenHelper(context, "mca.sqlite3", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE MCASEM3(ROLL INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SEMESTER NUMBER)")
        p0?.execSQL("INSERT INTO MCASEM3 VALUES(NULL,'NISHAR',3)")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}