package com.wasfan.fixfastbuddy2.Garage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import com.wasfan.fixfastbuddy2.R

class RegisterPage3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_register_page3)

        val register: Button = findViewById(R.id.register)

        register.setOnClickListener{
            startActivity(Intent(this, Home::class.java))
        }
    }
}