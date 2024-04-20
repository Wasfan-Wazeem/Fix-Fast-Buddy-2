package com.wasfan.fixfastbuddy2.Garage

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.wasfan.fixfastbuddy2.R

class AddMechanics : AppCompatActivity() {
    private lateinit var backbtn : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_add_mechanics)

        backbtn=findViewById(R.id.backbutton)

        backbtn.setOnClickListener{
            onBackPressed()
        }
    }
}