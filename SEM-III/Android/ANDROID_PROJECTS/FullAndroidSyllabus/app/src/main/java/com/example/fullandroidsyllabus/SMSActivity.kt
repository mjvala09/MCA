package com.example.fullandroidsyllabus

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.telephony.SmsManager
import android.telephony.TelephonyManager
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat

class SMSActivity : AppCompatActivity() {

    lateinit var send : Button
    lateinit var phoneNumber : EditText
    lateinit var messageBody : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smsactivity)

        phoneNumber = findViewById(R.id.phoneNumber)
        messageBody = findViewById(R.id.messageBody)

        send = findViewById(R.id.sendSMS)
        send.isEnabled = false
        if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.SEND_SMS, android.Manifest.permission.READ_SMS, android.Manifest.permission.RECEIVE_SMS), 105)
        }else{
            send.isEnabled = true
            receiveSMS()
        }
        send.setOnClickListener {
            sendSMS()
        }

    }

    private fun receiveSMS() {
        var br = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
                    for(sms in Telephony.Sms.Intents.getMessagesFromIntent(p1)){
                        phoneNumber.setText(sms.originatingAddress)
                        messageBody.setText(sms.displayMessageBody)
                    }
                }
            }
        }
        registerReceiver(br, IntentFilter("android.provider.Telephony.SMS_RECEIVED"))
    }

    private fun sendSMS() {
        var smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phoneNumber.text.toString(), "8530694641", messageBody.text.toString(), null, null)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 105 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            send.isEnabled = true
        }
    }
}