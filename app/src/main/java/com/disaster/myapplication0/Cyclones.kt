package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_cyclones.*
import kotlinx.android.synthetic.main.content_cyclones.*

class Cyclones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cyclones)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnCyclonesInfo.setOnClickListener {
            var intent= Intent(this,CyclonesInfo::class.java)
            startActivity(intent)
        }
        btnCyclonesMap.setOnClickListener {
            var intent= Intent(this,CyclonesMap::class.java)
            startActivity(intent)
        }
        btnCyclonesDo.setOnClickListener {
            var intent= Intent(this,CyclonesDo::class.java)
            startActivity(intent)
        }
        btnCyclonesRecovery.setOnClickListener {
            var intent= Intent(this,CyclonesRecovery::class.java)
            startActivity(intent)
        }
        btnCyclonesEmergency.setOnClickListener {
            var intent= Intent(this,CyclonesEmergency::class.java)
            startActivity(intent)
        }
        btnCyclonesGuideline.setOnClickListener {
            var intent= Intent(this,CyclonesGuideline::class.java)
            startActivity(intent)
        }
    }

}
