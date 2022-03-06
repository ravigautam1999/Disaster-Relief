package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_game_based_learnig.*
import kotlinx.android.synthetic.main.content_game_based_learnig.*

class GameBasedLearnig : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_based_learnig)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btngame.setOnClickListener {
            var intent = Intent(this,KidsGame::class.java)
            startActivity(intent)
        }
    }

}
