package com.example.animation20231003

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        var animationImage = findViewById<ImageView>(R.id.animationImage)
        var ad = AnimationDrawable()

        var frame1 = resources.getDrawable(R.drawable.frame1,null)
        var frame2 = resources.getDrawable(R.drawable.frame2,null)
        var frame3 = resources.getDrawable(R.drawable.frame3,null)
        var frame4 = resources.getDrawable(R.drawable.frame4,null)
        var frame5 = resources.getDrawable(R.drawable.frame5,null)
        var frame6 = resources.getDrawable(R.drawable.frame6,null)
        var frame7 = resources.getDrawable(R.drawable.frame7,null)

        ad.addFrame(frame1,30)
        ad.addFrame(frame2,30)
        ad.addFrame(frame3,30)
        ad.addFrame(frame4,30)
        ad.addFrame(frame5,30)
        ad.addFrame(frame6,30)
        ad.addFrame(frame7,30)

        animationImage.background = ad
        ad.start()

    }
}