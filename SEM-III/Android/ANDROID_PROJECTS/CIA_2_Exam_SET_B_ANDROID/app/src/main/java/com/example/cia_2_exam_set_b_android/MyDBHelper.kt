package com.example.cia_2_exam_set_b_android

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDBHelper(context: Context?) : SQLiteOpenHelper(context, "STUD_DB",null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE STUDENT (SID INTEGER PRIMARY KEY AUTOINCREMENT,  SNAME TEXT , SEM NUMBER,CITY TEXT)")
        p0?.execSQL("INSERT INTO STUDENT VALUES (NULL,'ATMIYA',3,'RAJKOT')")
        p0?.execSQL("INSERT INTO STUDENT VALUES (NULL,'MCA',1,'SURAT')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
    }
}