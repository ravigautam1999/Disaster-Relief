package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_floods.*
import kotlinx.android.synthetic.main.content_floods.*

class Floods : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floods)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnFloodsInfo.setOnClickListener {
            var intent= Intent(this,FloodsInfo::class.java)
            startActivity(intent)
        }
        btnFloodsMap.setOnClickListener {
            var intent= Intent(this,FloodsMap::class.java)
            startActivity(intent)
        }
        btnFloodsDo.setOnClickListener {
            var intent= Intent(this,FloodsDo::class.java)
            startActivity(intent)
        }
        btnFloodsEmergency.setOnClickListener {
            var intent= Intent(this,FloodsEmergency::class.java)
            startActivity(intent)
        }
        btnFloodsGuideline.setOnClickListener {
            var intent= Intent(this,FloodsGuidelines::class.java)
            startActivity(intent)
        }
    }

}
