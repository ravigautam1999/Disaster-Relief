package com.disaster.myapplication0

import android.content.Intent
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        
        /*val fab: FloatingActionButton = findViewById(R.id.nav_intro)
        fab.setOnClickListener { view ->
            Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
        }*/


        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
      appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_about,R.id.nav_intro,R.id.nav_nature,R.id.nav_man,R.id.nav_cycle,R.id.nav_kit,R.id.nav_game,R.id.nav_ref
            ), drawerLayout
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            if (destination.id == R.id.nav_about) {
                Toast.makeText(this@MainActivity, "About", Toast.LENGTH_SHORT).show()
            }
            if (destination.id == R.id.nav_intro) {
                val intent= Intent(this,Introduction::class.java)
                startActivity(intent)
            }
            if (destination.id == R.id.nav_nature) {
               val intent= Intent(this,NatuteDisaster::class.java)
                startActivity(intent)
            }
            if (destination.id == R.id.nav_man) {
                val intent= Intent(this,ManMadeDisaster::class.java)
                startActivity(intent)
            }
            if (destination.id == R.id.nav_cycle) {
                val intent= Intent(this,DisasterManagementCycle::class.java)
                startActivity(intent)
            }
            if (destination.id == R.id.nav_kit) {
                val intent= Intent(this,DisaterEmergencyKit::class.java)
                startActivity(intent)
            }
            if (destination.id == R.id.nav_game) {
                val intent= Intent(this,GameBasedLearnig::class.java)
                startActivity(intent)
            }
            if (destination.id == R.id.nav_ref) {
                val intent= Intent(this,References::class.java)
                startActivity(intent)
            }
            if (destination.id == R.id.nav_ngos) {
                val intent= Intent(this,NGOs::class.java)
                startActivity(intent)
            }
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId){
            R.id.action_settings->{
                val message:String="Please,download 'Disaster Relife' application from Google Play Store"
                var intent = Intent()
                intent.action = Intent.ACTION_SEND

                intent.putExtra(Intent.EXTRA_TEXT,message)
                intent.type="text/plain"
                startActivity(Intent.createChooser(intent,"Share To: "))
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
