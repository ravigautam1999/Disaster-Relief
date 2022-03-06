package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_natute_disaster.*
import kotlinx.android.synthetic.main.content_natute_disaster.*

class NatuteDisaster : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_natute_disaster)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnEarthquakes.setOnClickListener {
            var intent = Intent(this,EarthQuakes::class.java)
            startActivity(intent)
        }
        btnFloods.setOnClickListener {
            var intent = Intent(this,Floods::class.java)
            startActivity(intent)
        }
        btnLandslides.setOnClickListener {
            var intent = Intent(this,Landslides::class.java)
            startActivity(intent)
        }
        btnCyclones.setOnClickListener {
            var intent = Intent(this,Cyclones::class.java)
            startActivity(intent)
        }
        btnTsunamis.setOnClickListener {
            var intent = Intent(this,Tsunamis::class.java)
            startActivity(intent)
        }
        btnDrought.setOnClickListener {
            var intent = Intent(this,Drought::class.java)
            startActivity(intent)
        }
        btnUrbanFlood.setOnClickListener {
            var intent = Intent(this,UrbanFlood::class.java)
            startActivity(intent)
        }
        btnHeatwave.setOnClickListener {
            var intent = Intent(this,HeatWave::class.java)
            startActivity(intent)
        }
    }

}
