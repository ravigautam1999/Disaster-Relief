package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_urban_flood.*
import kotlinx.android.synthetic.main.content_urban_flood.*

class UrbanFlood : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_urban_flood)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnUrbanFloodInfo.setOnClickListener {
            var intent =Intent(this,UrbanFloodInfo::class.java)
            startActivity(intent)

        }
        btnUrbanFloodDo.setOnClickListener {
            var intent =Intent(this,UrbanFloodDo::class.java)
            startActivity(intent)

        }
        btnUrbanFloodRecovery.setOnClickListener {
            var intent =Intent(this,UrbanFloodRecovery::class.java)
            startActivity(intent)

        }
        btnUrbanFloodEmergengy.setOnClickListener {
            var intent =Intent(this,UrbanFloodEmergency::class.java)
            startActivity(intent)

        }
        btnUrbanFloodGuideline.setOnClickListener {
            var intent =Intent(this,UrbanFloodGuideline::class.java)
            startActivity(intent)

        }
    }

}
