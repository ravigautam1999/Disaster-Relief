package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_man_made_disaster.*
import kotlinx.android.synthetic.main.content_man_made_disaster.*

class ManMadeDisaster : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man_made_disaster)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnManMadeDisasterNuclear.setOnClickListener {
            var intent=Intent(this,NuclearDisasters::class.java)
            startActivity(intent)
        }
        btnManMadeDisasterIndustrial.setOnClickListener {
            var intent=Intent(this,IndustrialandChemicalDisasters::class.java)
            startActivity(intent)
        }
        btnManMadeDisasterBiological.setOnClickListener {
            var intent=Intent(this,BiologicalDisasters::class.java)
            startActivity(intent)
        }
    }

}
