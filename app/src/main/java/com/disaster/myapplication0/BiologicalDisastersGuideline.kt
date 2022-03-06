package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_biological_disasters_guideline.*
import kotlinx.android.synthetic.main.content_biological_disasters_guideline.*

class BiologicalDisastersGuideline : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biological_disasters_guideline)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnguidebio.setOnClickListener {
           var intent= Intent(this,Guideline::class.java)
            startActivity(intent)
        }
    }

}
