package com.example.menu20230926

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        registerForContextMenu(textView)


    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.add(1,11,1,"RED")
        menu?.add(2,22,2,"GREEN")
        menu?.add(3,33,3,"YELLOW")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            11->textView.setTextColor(Color.RED)
            22->textView.setTextColor(Color.GREEN)
            33->textView.setTextColor(Color.YELLOW)
        }
        return super.onContextItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add(101,1001,1,"Change colors")
        menu?.add(102,1002,2,"+")
        menu?.add(103,1003,3,"-")
        menu?.add(104,1004,4,"Box Color")

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            1001 -> {
                Toast.makeText(applicationContext,
                    "Long press to change the Color",
                    Toast.LENGTH_LONG).show()
            }
            1002 -> {
                textView.textSize +=1
            }
            1003 -> {
                textView.textSize -=1
            }
            1004 -> {

            }
        }

        return super.onOptionsItemSelected(item)
    }
}