package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_urban_flood_guideline.*
import kotlinx.android.synthetic.main.content_urban_flood_guideline.*

class UrbanFloodGuideline : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_urban_flood_guideline)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnFloodsgo.setOnClickListener {
           var intent= Intent(this,Guideline::class.java)
            startActivity(intent)
        }
    }

}
