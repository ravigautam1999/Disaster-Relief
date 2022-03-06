package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_earth_quakes.*
import kotlinx.android.synthetic.main.content_earth_quakes.*

class EarthQuakes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_earth_quakes)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        btnEarthquakesInfo.setOnClickListener {
            var intent = Intent(this,EarthQuakeInfo::class.java)
            startActivity(intent)
        }
        btnEarthquakesMap.setOnClickListener {
            var intent = Intent(this,EarthQuakeMap::class.java)
            startActivity(intent)
        }
        btnEarthquakesDo.setOnClickListener {
            var intent = Intent(this,EarthQuakeDo::class.java)
            startActivity(intent)
        }
        btnEarthquakesRecover.setOnClickListener {
            var intent = Intent(this,EarthQuakeRecover::class.java)
            startActivity(intent)
        }
        btnEarthquakesEmergency.setOnClickListener {
            var intent = Intent(this,EarthQuakeEmergency::class.java)
            startActivity(intent)
        }
        btnEarthquakesGuideline.setOnClickListener {
            var intent = Intent(this,EarthQuakeGuideline::class.java)
            startActivity(intent)
        }

    }

}
