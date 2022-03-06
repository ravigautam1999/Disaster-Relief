package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_landslides.*
import kotlinx.android.synthetic.main.content_landslides.*

class Landslides : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landslides)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnLandslidesInfo.setOnClickListener {
            var intent =Intent(this, LandslidesInfo::class.java)
            startActivity(intent)
        }
        btnLandslidesMap.setOnClickListener {
            var intent =Intent(this, LandslideMap::class.java)
            startActivity(intent)
        }
        btnLandslidesDo.setOnClickListener {
            var intent =Intent(this, LandslideDo::class.java)
            startActivity(intent)
        }
        btnLandslidesRecovery.setOnClickListener {
            var intent =Intent(this, LandslidesRecover::class.java)
            startActivity(intent)
        }
        btnLandslidesEmergency.setOnClickListener {
            var intent =Intent(this, LandslidesEmergency::class.java)
            startActivity(intent)
        }
        btnLandslidesGuideline.setOnClickListener {
            var intent =Intent(this, LandslidesGuideline::class.java)
            startActivity(intent)
        }
    }

}
