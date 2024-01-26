package com.example.fullandroidsyllabus

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.ProgressDialog
import android.app.TimePickerDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.MultiAutoCompleteTextView
import android.widget.ProgressBar
import android.widget.Toast
import java.util.Calendar

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var toggle_btn = findViewById<Button>(R.id.toggle_btn)
        toggle_btn.setOnClickListener {
            if(toggle_btn.text == "ON"){
                toggle_btn.setTextColor(Color.BLACK)
                toggle_btn.text = "OFF"
            }else{
                toggle_btn.setTextColor(Color.WHITE)
                toggle_btn.text = "ON"
            }
        }
        findViewById<Button>(R.id.alertDialog).setOnClickListener {
            var ad = AlertDialog.Builder(this)
                .setTitle("Alert Dialog")
                .setMessage("This is just testing android🤣🤣")
                .setPositiveButton("OK",
                    DialogInterface.OnClickListener { dialogInterface, i ->

                    })

            ad.show()
        }
        findViewById<Button>(R.id.timeDatePickerDialog).setOnClickListener {
            var c = Calendar.getInstance()
            var dd = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->
                    TimePickerDialog(this,
                        TimePickerDialog.OnTimeSetListener { timePicker, i, i2 ->
//    we can set the date and time to any object here!
                        },c.get(Calendar.HOUR),c.get(Calendar.MINUTE),false).show()
                },c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show()
        }
        findViewById<Button>(R.id.progressBarBtn).setOnClickListener {
            var pb = findViewById<ProgressBar>(R.id.progressBar)
            Thread( Runnable {
                var count = 0
                while (count <= 100){
                    pb.progress = count
                    count+=10
                    Thread.sleep(1000)
                }
            }).start()
        }
        findViewById<Button>(R.id.progressDialogBtn).setOnClickListener {
            var p = ProgressDialog(this)
            p.setTitle("Progress Dialog")
            p.setMessage("Just testing android")
            p.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
            p.show()

            Thread( Runnable {
                var count = 0
                while(count <= 100){
                    p.progress = count
                    count += 10
                    Thread.sleep(100)
                }
                if(count >= 100){
                    p.dismiss()
                }
            }).start()
        }

        var cityAuto = findViewById<AutoCompleteTextView>(R.id.cityAuto)
        var cityNames = arrayOf("Ahmedabad","Rajkot","Rajsitapur","Randhanpur", "Ratanpar")
        cityAuto.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                var adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_dropdown_item_1line, cityNames)
                cityAuto.setAdapter(adapter)
            }
            override fun afterTextChanged(p0: Editable?) {}
        })

        var skillsNames = arrayOf("Java","Java Script","Kotlin","Android","Python","PHP")
        var skillsMulti = findViewById<MultiAutoCompleteTextView>(R.id.skillsMulti)
        skillsMulti.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                var adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_checked, skillsNames)
                skillsMulti.setAdapter(adapter)
                skillsMulti.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())
            }
            override fun afterTextChanged(p0: Editable?) {}
        })
        var sp = application.getSharedPreferences("autoMulti", Context.MODE_PRIVATE)
        var editor = sp.edit()
        findViewById<Button>(R.id.saveInSharedPreferences).setOnClickListener {
            editor.putString("city", cityAuto.text.toString())
            editor.putString("skills", skillsMulti.text.toString())
            editor.commit()
        }
        findViewById<Button>(R.id.resetFromSharedPreferences).setOnClickListener {
            cityAuto.setText(sp.getString("city",""))
            skillsMulti.setText(sp.getString("skills",""))
        }
        findViewById<Button>(R.id.databaseBTN).setOnClickListener {
            startActivity(Intent(this, DatabaseActivity::class.java))
        }
        findViewById<Button>(R.id.animation).setOnClickListener {
            startActivity(Intent(this, AnimationActivity::class.java))
        }

        findViewById<Button>(R.id.audioBTN).setOnClickListener {
            startActivity(Intent(this, AudioPlayer::class.java))
        }
        findViewById<Button>(R.id.videoBTN).setOnClickListener {
            startActivity(Intent(this, VideoPlayer::class.java))
        }
        findViewById<Button>(R.id.imageBTN).setOnClickListener {
            startActivity(Intent(this, ImageCapture::class.java))
        }
        findViewById<Button>(R.id.sendReceiveSMS).setOnClickListener {
            startActivity(Intent(this, SMSActivity::class.java))
        }
    }
}