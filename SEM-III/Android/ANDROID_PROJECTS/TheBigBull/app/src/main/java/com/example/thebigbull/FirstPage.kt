package com.example.thebigbull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.SeekBar
import android.widget.TextView

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        var sb = findViewById<SeekBar>(R.id.seekBar)
        var sbt = findViewById<TextView>(R.id.seekbarText)

        sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                sbt.text = "$p1"
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })

        var rb : RatingBar = findViewById(R.id.ratingBar)
        var rbt : TextView = findViewById(R.id.ratingbarText)

        rb.setOnRatingBarChangeListener { ratingBar, fl, b ->
            rbt.setText("$fl")
        }

//        rb.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener{
//            override fun onRatingChanged(p0: RatingBar?, p1: Float, p2: Boolean) {
//                rbt.setText("$p1")
//            }
//        })
    }
}