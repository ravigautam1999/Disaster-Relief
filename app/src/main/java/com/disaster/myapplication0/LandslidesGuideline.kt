package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_landslides_guideline.*
import kotlinx.android.synthetic.main.content_landslides_guideline.*

class LandslidesGuideline : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landslides_guideline)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnguideland.setOnClickListener {
            var intent = Intent(this,Guideline::class.java)
            startActivity(intent)
        }
    }

}
