package com.example.thebigbull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView

class AndroidTopics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_topics)

        var textView = findViewById<Button>(R.id.textView)
        var textViewShow = findViewById<TextView>(R.id.textViewShow)
        var description = findViewById<TextView>(R.id.descriptionTextView)


        var temp = textView.text
        textView.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                description.setText("" +
                        "A user interface \nelement that \ndisplays text\nto the user." +
                        "")
                textViewShow.setText("\uFEFF\n" +
                        "\n" +
                        "<TextView\n" +
                        "android:id=\"@+id/title_text_view\"\n" +
                        "android:layout_width=\"wrap_content\" android:layout_height=\"wrap_content\"\n" +
                        "android:text=\"@string/my_photos\"\n" +
                        "android:textAppearance=\"?android:textAppearanceLarge\"\n" +
                        "android:textColor=\"#4689C8\"\n" +
                        "android:textStyle=\"bold />\" " +
                        "\n\n\nTextView.setText() method\nTextView.text\nTextView.setOnClickListener\n(object : OnClickListener{\n" +
                        "            override fun onClick\n(p0: View?) {\n" +
                        "                textViewShow.setText(\"TextView.setText() method\\nTextView.text\\nTextView.\nsetOnClickListener{  }\")\n" +
                        "            }\n" +
                        "        })")
            }
        })
    }
}