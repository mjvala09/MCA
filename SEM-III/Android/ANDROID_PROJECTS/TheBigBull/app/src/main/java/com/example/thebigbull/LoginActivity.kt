package com.example.thebigbull

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var log_in : Button = findViewById(R.id.log_in)
        var email : EditText = findViewById(R.id.editTextTextEmailAddress2)
        var sign_in : Button = findViewById(R.id.sign_in)

        sign_in.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                var si = Intent(this@LoginActivity, SignInActivity::class.java)
                startActivity(si)
            }
        })

        log_in.isEnabled = false
        email.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(android.util.Patterns.EMAIL_ADDRESS.matcher(p0).matches()){
                    log_in.isEnabled = true
                }else{
                    log_in.isEnabled = false
                    email.setError("Enter Valid Email !")
                }
            }
            override fun afterTextChanged(p0: Editable?) {
            }
        })
        log_in.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                var li = Intent(this@LoginActivity, FirstPage::class.java)
                startActivity(li)
            }
        })

        var letsGetStarted : Button = findViewById(R.id.LetsGetStarted)
        letsGetStarted.setOnClickListener(object : OnClickListener {
            override fun onClick(p0: View?) {
                var intent = Intent(this@LoginActivity, AndroidTopics::class.java)
                startActivity(intent)
            }
        })
    }
}