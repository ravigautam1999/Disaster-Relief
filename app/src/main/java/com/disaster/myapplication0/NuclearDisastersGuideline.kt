package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_nuclear_disasters_guideline.*
import kotlinx.android.synthetic.main.content_nuclear_disasters_guideline.*

class NuclearDisastersGuideline : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuclear_disasters_guideline)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnguidenucl.setOnClickListener {
            var intent= Intent(this,Guideline::class.java)
            startActivity(intent)
        }
    }

}
