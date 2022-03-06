package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_heat_wave.*
import kotlinx.android.synthetic.main.content_heat_wave.*

class HeatWave : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heat_wave)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnHeatwaveInfo.setOnClickListener {
            var intent = Intent(this,HeatWaveInfo::class.java)
            startActivity(intent)
        }
        btnHeatwaveDo.setOnClickListener {
            var intent = Intent(this,HeatWaveDo::class.java)
            startActivity(intent)
        }
        btnHeatwaveRecovery.setOnClickListener {
            var intent = Intent(this,HeatWaveRecovery::class.java)
            startActivity(intent)
        }
        btnHeatwaveEmergency.setOnClickListener {
            var intent = Intent(this,HeatWavEmergency::class.java)
            startActivity(intent)
        }
    }

}
