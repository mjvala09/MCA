package com.example.examdemo1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.telephony.SmsManager
import android.telephony.SmsMessage
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.app.ActivityCompat

class Operations : AppCompatActivity() {

    lateinit var colors : TextView
    lateinit var SMSSend : Button
    lateinit var SMSNumber : EditText
    lateinit var SMSMessage : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operations)

        var colors = findViewById<TextView>(R.id.colors)
        registerForContextMenu(colors)

        SMSNumber = findViewById(R.id.SMSNumber)
        SMSMessage = findViewById(R.id.SMSMessage)
        findViewById<Button>(R.id.SMSClear).setOnClickListener {
            clearField()
        }
        SMSSend = findViewById(R.id.SMSSend)
        SMSSend.setOnClickListener {
            sendSMS()
        }
        if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.SEND_SMS,android.Manifest.permission.READ_SMS),10001)
        }else{
            receiveSMS()
        }

    }


    private fun receiveSMS() {
        var br = object : BroadcastReceiver(){
            override fun onReceive(p0: Context?, p1: Intent?) {
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
                    for(sms in Telephony.Sms.Intents.getMessagesFromIntent(p1)){
                        SMSNumber.setText(sms.originatingAddress)
                        SMSMessage.setText(sms.displayMessageBody)
                    }
                }
            }
        }
        registerReceiver(br, IntentFilter("android.provider.Telephony.SMS_RECEIVED"))
    }

    private fun sendSMS() {
        var smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(SMSNumber.text.toString(),"8530694641",SMSMessage.text.toString(),null,null)
        clearField()
    }

    private fun clearField() {
        SMSNumber.setText("")
        SMSMessage.setText("")
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.add(1,11,1,"RED")
        menu?.add(2,22,2,"GREEN")
        menu?.add(3,33,3,"CYAN")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        colors = findViewById(R.id.colors)
        when(item.itemId){
            11->{colors.setTextColor(Color.RED)}
            22->{colors.setTextColor(Color.GREEN)}
            33->{colors.setTextColor(Color.CYAN)}
        }
        return super.onContextItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add(1,11,1,"+")
        menu?.add(2,22,2,"-")
        menu?.add(3,33,3,"reset")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var size = 30f
        colors = findViewById(R.id.colors)
        when(item.itemId){
            11->{colors.textSize = size+5}
            22->{colors.textSize = size-5}
            33->{colors.textSize = 30f}
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 10001 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            sendSMS()
            receiveSMS()
        }
    }
}