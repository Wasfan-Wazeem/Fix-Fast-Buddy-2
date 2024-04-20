package com.wasfan.fixfastbuddy2.Garage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.wasfan.fixfastbuddy2.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_home)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.bottom_home ->{
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.bottom_activities ->{
                    replaceFragment(ActivitiesFragment())
                    true
                }
                R.id.bottom_maintenance ->{
                    replaceFragment(MaintenanceFragment())
                    true
                }
                R.id.bottom_profile ->{
                    replaceFragment(ProfileFragment())
                    true
                }

                else -> false
            }

        }
        replaceFragment(HomeFragment())
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit()
    }
}