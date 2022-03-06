package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_ngos.*
import kotlinx.android.synthetic.main.content_ngos.*

class NGOs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ngos)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnallhand.setOnClickListener{
            var intent = Intent(this,AllHand::class.java)
            startActivity(intent)
        }
        btnmcc.setOnClickListener{
            var intent = Intent(this,MCC::class.java)
            startActivity(intent)
        }
        btnnd.setOnClickListener{
            var intent = Intent(this,CN::class.java)
            startActivity(intent)
        }

        btnreact.setOnClickListener{
            var intent = Intent(this,React::class.java)
            startActivity(intent)
        }

        btnmsf.setOnClickListener{
            var intent = Intent(this,MSF::class.java)
            startActivity(intent)
        }
        btnoxf.setOnClickListener{
            var intent = Intent(this,Oxfem::class.java)
            startActivity(intent)
        }

        btnagn.setOnClickListener{
            var intent = Intent(this,AMURT::class.java)
            startActivity(intent)
        }

        btnallcob.setOnClickListener{
            var intent = Intent(this,COB::class.java)
            startActivity(intent)
        }

        btncity.setOnClickListener{
            var intent = Intent(this,CityTeam::class.java)
            startActivity(intent)
        }
        btndr.setOnClickListener{
            var intent = Intent(this,DirectRelief::class.java)
            startActivity(intent)
        }
    }

}
