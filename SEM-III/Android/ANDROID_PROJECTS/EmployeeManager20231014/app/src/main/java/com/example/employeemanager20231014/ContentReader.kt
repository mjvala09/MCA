package com.example.employeemanager20231014

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class ContentReader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_reader)

        findViewById<Button>(R.id.contact).setOnClickListener {
            var i = Intent(this, ContactList::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.callLog).setOnClickListener {
            var i = Intent(this, CallLogReader::class.java)
            startActivity(i)
        }

    }
}