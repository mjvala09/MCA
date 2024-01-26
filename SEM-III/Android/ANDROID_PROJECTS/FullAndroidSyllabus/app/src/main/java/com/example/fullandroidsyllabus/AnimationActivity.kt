package com.example.fullandroidsyllabus

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        var ad = AnimationDrawable()

        ad.addFrame(resources.getDrawable(R.drawable.frame1,null),30)
        ad.addFrame(resources.getDrawable(R.drawable.frame2,null),30)
        ad.addFrame(resources.getDrawable(R.drawable.frame3,null),30)
        ad.addFrame(resources.getDrawable(R.drawable.frame4,null),30)
        ad.addFrame(resources.getDrawable(R.drawable.frame5,null),30)
        ad.addFrame(resources.getDrawable(R.drawable.frame6,null),30)
        ad.addFrame(resources.getDrawable(R.drawable.frame7,null),30)

        findViewById<ImageView>(R.id.animationImage).background = ad
        ad.start()
    }
}