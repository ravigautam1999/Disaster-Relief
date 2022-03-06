package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_industrial_disaster_guidleline.*
import kotlinx.android.synthetic.main.content_industrial_disaster_guidleline.*

class IndustrialDisasterGuidleline : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_industrial_disaster_guidleline)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        btnguideindust.setOnClickListener {
            var intent= Intent(this,Guideline::class.java)
            startActivity(intent)
        }

    }

}
