package com.example.gradient20231007

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.RadialGradient
import android.graphics.Shader
import android.graphics.SweepGradient
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(Test(applicationContext))
    }
    inner class Test(applicationContext : Context) : View(applicationContext) {
        var p = Paint(Paint.ANTI_ALIAS_FLAG)

        override fun onDraw(canvas: Canvas?) {
            super.onDraw(canvas)

            var lg = LinearGradient(0f,0f,45f,45f,Color.RED,Color.BLACK, Shader.TileMode.MIRROR)
            p.shader = lg
            canvas?.drawCircle(250f,250f,200f,p)

            var rg = RadialGradient(200f,600f,200f,Color.RED,Color.BLACK,Shader.TileMode.MIRROR)
            p.shader = rg
            canvas?.drawCircle(250f,750f,200f,p)

            var sg = SweepGradient(200f,1300f, intArrayOf(Color.RED,Color.GREEN,Color.BLACK,Color.CYAN),null)
            p.shader = sg
            canvas?.drawCircle(250f,1300f,200f,p)
        }
    }
}