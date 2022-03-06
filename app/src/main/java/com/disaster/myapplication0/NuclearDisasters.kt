package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_nuclear_disasters.*
import kotlinx.android.synthetic.main.content_nuclear_disasters.*

class NuclearDisasters : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuclear_disasters)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        btnManMadeDisasterNuclearInfo.setOnClickListener {
            var intent = Intent(this,NuclearDisasterInfo1::class.java)
            startActivity(intent)
        }
        btnManMadeDisasterNuclearDo.setOnClickListener {
            var intent = Intent(this,NuclearDisastersDo::class.java)
            startActivity(intent)
        }
        btnManMadeDisasterNuclearGuideline.setOnClickListener {
            var intent = Intent(this,NuclearDisastersGuideline::class.java)
            startActivity(intent)
        }
       

    }

}
