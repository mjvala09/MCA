package com.example.thebigbull

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.TimePicker
import java.util.Calendar

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        var submit_signin = findViewById<Button>(R.id.edButton)
        var check_box = findViewById<CheckBox>(R.id.edCheckBox)
        var c = Calendar.getInstance()

        var name : EditText = findViewById(R.id.edName)
        var mobile : EditText = findViewById(R.id.edMobile)
        var email : EditText = findViewById(R.id.edEmail)
        var date = findViewById<EditText>(R.id.edDate)
        var time = findViewById<EditText>(R.id.edTime)








        submit_signin.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                var submit = Intent(this@SignInActivity, SignInButton::class.java)
                startActivity(submit)
            }
        })
        submit_signin.isEnabled = false
        check_box.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                submit_signin.isEnabled = check_box.isChecked
            }
        })

        email.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (!android.util.Patterns.EMAIL_ADDRESS.matcher(p0).matches()) {
                    email.setError("Valid Email")
                }
            }
            override fun afterTextChanged(p0: Editable?) {
            }
        })


        time.setOnClickListener {
            TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                time.setText("$hour : $minute")
            },c.get(Calendar.HOUR),c.get(Calendar.MINUTE),true).show()
        }

        date.setOnClickListener {
            DatePickerDialog(this,DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
                date.setText("$day/${month + 1}/$year")
            },c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show()
        }






        submit_signin.setOnClickListener {
            var i = Intent(this, SignInButton::class.java)
            i.putExtra("name", name.text)
            i.putExtra("mobile", mobile.text)
            i.putExtra("email", email.text)
            i.putExtra("date", date.text)
            i.putExtra("time", time.text)
            startActivity(i)
        }
    }
}