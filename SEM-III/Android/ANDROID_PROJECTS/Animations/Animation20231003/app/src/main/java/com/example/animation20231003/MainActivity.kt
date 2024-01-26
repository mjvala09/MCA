package com.example.animation20231003

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var image : ImageView
    lateinit var another_image : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById(R.id.image)
        var btn_image = findViewById<Button>(R.id.animation)
        btn_image.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                var i = Intent(this@MainActivity,AnimationActivity::class.java)
                startActivity(i)
            }
        })

        another_image = findViewById(R.id.another_image)
        another_image.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                image.setImageResource(R.drawable.frame)
            }

        })

        var blink = findViewById<Button>(R.id.blink)
        blink.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.blink)
            image.startAnimation(an)
        }

        var move = findViewById<Button>(R.id.move)
        move.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.move)
            image.startAnimation(an)
        }

        var spin = findViewById<Button>(R.id.spin)
        spin.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.spin)
            image.startAnimation(an)
        }

        var zoom = findViewById<Button>(R.id.zoom)
        zoom.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.zoom)
            image.startAnimation(an)
        }



    }
}