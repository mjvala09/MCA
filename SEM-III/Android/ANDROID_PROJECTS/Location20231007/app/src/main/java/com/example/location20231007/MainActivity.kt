package com.example.location20231007

import android.content.pm.PackageManager
import android.location.Geocoder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.app.ActivityCompat
import java.util.Locale

class MainActivity : AppCompatActivity() {

    lateinit var btn_search : Button
    lateinit var loc : EditText
    lateinit var result : TextView
    var city = "Atmiya University, Rajkot"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_search = findViewById(R.id.btn_search)
        loc = findViewById(R.id.loc)
        result = findViewById(R.id.result)

        if(ActivityCompat.checkSelfPermission(
                this,
                android.Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED
        ){
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION,
                        android.Manifest.permission.ACCESS_COARSE_LOCATION),
                123)
        }
        btn_search.setOnClickListener {
            city = loc.text.toString()
            forwardGeocode(city)
        }


    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 123 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            forwardGeocode(city)
        }
    }


    private fun forwardGeocode(city: String) {
        var gc = Geocoder(this, Locale.getDefault())
        var addresses = gc.getFromLocationName(city,2)
        var address = addresses?.get(0)
        result.setText("${address?.longitude}\n${address?.latitude}\n${address?.locality}")
    }
}