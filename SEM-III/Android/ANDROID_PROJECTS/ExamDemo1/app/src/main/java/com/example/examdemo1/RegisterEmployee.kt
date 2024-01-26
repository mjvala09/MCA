package com.example.examdemo1

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.ContentResolver
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.text.Editable
import android.text.TextWatcher
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.SimpleCursorAdapter
import android.widget.Toast
import androidx.core.app.ActivityCompat
import java.time.LocalDateTime
import java.util.Calendar
import java.util.Date

class RegisterEmployee : AppCompatActivity() {

    lateinit var rs : Cursor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_employee)

        var helper : MyDbHelper = MyDbHelper(applicationContext)
        var db = helper.writableDatabase

        var name = findViewById<EditText>(R.id.name)
        var mobile = findViewById<AutoCompleteTextView>(R.id.mobile)
        var email = findViewById<EditText>(R.id.email)
        var date = findViewById<EditText>(R.id.date)
        var password = findViewById<EditText>(R.id.password)


//--------------------------------------------------------------------------------------------------

        mobile.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                if(ActivityCompat.checkSelfPermission(this@RegisterEmployee,android.Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(this@RegisterEmployee, arrayOf(android.Manifest.permission.READ_CONTACTS),1010)
                }else{
                    // Create a ContentResolver to access the ContentProvider
//                    val contentResolver = contentResolver

                    // Set the AutoCompleteTextView's adapter to a SimpleCursorAdapter that uses the ContentResolver to query the ContentProvider
                    val adapter = SimpleCursorAdapter(applicationContext, android.R.layout.simple_list_item_1, rs, arrayOf(ContactsContract.CommonDataKinds.Phone.NUMBER), intArrayOf(android.R.id.text1))
                    mobile.setAdapter(adapter)

                    // Query the ContentProvider for contact data
                    val rs = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, arrayOf(ContactsContract.CommonDataKinds.Phone.NUMBER,ContactsContract.CommonDataKinds.Phone._ID), "display_name LIKE '%${mobile.text}%'", null, null)
                    adapter.changeCursor(rs)
                }
            }

            override fun afterTextChanged(p0: Editable?) {

            }
        })
        mobile.setOnItemClickListener { adapterView, view, position, id ->
            var adapter = mobile.adapter as SimpleCursorAdapter
            var position = adapterView.selectedItemPosition
            var cursor = adapter.cursor
            cursor.moveToPosition(position+10)
            Toast.makeText(applicationContext,"$position",Toast.LENGTH_LONG).show()
        }










//--------------------------------------------------------------------------------------------------
        findViewById<Button>(R.id.registerEmployee).setOnClickListener {
            var cv = ContentValues()
            cv.put("NAME",name.text.toString())
            cv.put("MOBILE",mobile.text.toString())
            cv.put("EMAIL",email.text.toString())
            cv.put("PASSWORD",password.text.toString())
            db.insert("EMPLOYEE",null,cv)

            var i = Intent(this,LoginActivity::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.clearRegister).setOnClickListener {
            name.setText("")
            email.setText("")
            mobile.setText("")
            password.setText("")
        }
        var c = Calendar.getInstance()
        date.setOnClickListener {
            DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
                    var dt = "$day/${month+1}/$year"
                    TimePickerDialog(this,
                        TimePickerDialog.OnTimeSetListener { timePicker, hour, min ->
                            dt += "  $hour:$min"
                            date.setText("$dt")
                        },c.get(Calendar.HOUR),c.get(Calendar.MINUTE),false
                        ).show()
                },c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)
            ).show()
        }



    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 1010 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            var rs = contentResolver.query(
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                arrayOf(ContactsContract.CommonDataKinds.Phone.NUMBER),
                null,
                null,
                ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME
            )
            var adapter = SimpleCursorAdapter(applicationContext,
                android.R.layout.simple_list_item_1,
                rs,
                arrayOf(ContactsContract.CommonDataKinds.Phone.NUMBER),
                intArrayOf(android.R.id.text1),
                0
            )
        }
    }
}