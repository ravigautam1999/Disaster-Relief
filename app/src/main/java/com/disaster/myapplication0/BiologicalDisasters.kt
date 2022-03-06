package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_biological_disasters.*
import kotlinx.android.synthetic.main.content_biological_disasters.*

class BiologicalDisasters : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biological_disasters)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnManMadeDisasterBiologicalInfo.setOnClickListener {
            var intent = Intent(this,BiologicalDisastersInfo::class.java)
            startActivity(intent)
        }
        btnManMadeDisasterBiologicalDo.setOnClickListener {
            var intent = Intent(this,BiologicalDisastersDo::class.java)
            startActivity(intent)
        }
        btnManMadeDisasterBiologicalEmergency.setOnClickListener {
            var intent = Intent(this,BiologicalDisastersEmergency::class.java)
            startActivity(intent)
        }
        btnManMadeDisasterBiologicalGuideline.setOnClickListener {
            var intent = Intent(this,BiologicalDisastersGuideline::class.java)
            startActivity(intent)
        }
    }

}
