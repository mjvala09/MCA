package com.example.employeemanager20231014

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import androidx.core.app.ActivityCompat

class CallLogReader : AppCompatActivity() {

    var columns = arrayOf(
        CallLog.Calls.CACHED_NAME,
        CallLog.Calls.DURATION,
        CallLog.Calls._ID
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_log_reader)

        if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.READ_CALL_LOG) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.READ_CALL_LOG),102)
        }else{
            readCallLogs()
        }
    }
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 102 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            readCallLogs()
        }
    }

    private fun readCallLogs() {

        var callLogList = findViewById<ListView>(R.id.callLogList)

        var rs = contentResolver.query(CallLog.Calls.CONTENT_URI,
            columns,null,null,CallLog.Calls.DURATION)
        var adapter = SimpleCursorAdapter(applicationContext,
            android.R.layout.simple_list_item_2,
            rs,
            columns,
            intArrayOf(android.R.id.text1,android.R.id.text2),
            0
        )
        callLogList.adapter = adapter
    }
}