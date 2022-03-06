package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_tsunamis.*
import kotlinx.android.synthetic.main.content_tsunamis.*

class Tsunamis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tsunamis)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnTsunamisInfo.setOnClickListener {
            var intent = Intent(this,TsunamisInfo::class.java)
            startActivity(intent)
        }
        btnTsunamisMap.setOnClickListener {
            var intent = Intent(this,TsunamisMap::class.java)
            startActivity(intent)
        }
        btnTsunamisDo.setOnClickListener {
            var intent = Intent(this,TsunamisDo::class.java)
            startActivity(intent)
        }
        btnTsunamisRecovery.setOnClickListener {
            var intent = Intent(this,TsunamisRecovery::class.java)
            startActivity(intent)
        }
        btnTsunamisEmergency.setOnClickListener {
            var intent = Intent(this,TsunamisEmergency::class.java)
            startActivity(intent)
        }
        btnTsunamisGuideline.setOnClickListener {
            var intent = Intent(this,TsunamisGuideline ::class.java)
            startActivity(intent)
        }
    }

}
