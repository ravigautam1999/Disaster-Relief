package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_industrialand_chemical_disasters.*
import kotlinx.android.synthetic.main.content_industrialand_chemical_disasters.*

class IndustrialandChemicalDisasters : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_industrialand_chemical_disasters)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnManMadeDisasterIndustrialInfo.setOnClickListener {
            var intent=Intent(this,IndustrialDisasterInfo::class.java)
            startActivity(intent)
        }
        btnManMadeDisasterIndustrialCommon.setOnClickListener {
            var intent=Intent(this,IndustrialDisasterCommon::class.java)
            startActivity(intent)
        }
        btnManMadeDisasterIndustrialDo.setOnClickListener {
            var intent=Intent(this,IndustriaDisasterDo::class.java)
            startActivity(intent)
        }
        btnManMadeDisasterIndustrialGuideline.setOnClickListener {
            var intent=Intent(this,IndustrialDisasterGuidleline::class.java)
            startActivity(intent)
        }
    }

}
