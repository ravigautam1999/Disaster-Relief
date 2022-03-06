package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_drought.*
import kotlinx.android.synthetic.main.content_drought.*

class Drought : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drought)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnDroughtInfo.setOnClickListener {
            var intent =Intent(this,DroughtInfo::class.java)
            startActivity(intent)
        }
        btnDroughtDo.setOnClickListener {
            var intent =Intent(this,DroughtDo::class.java)
            startActivity(intent)
        }
    }

}
