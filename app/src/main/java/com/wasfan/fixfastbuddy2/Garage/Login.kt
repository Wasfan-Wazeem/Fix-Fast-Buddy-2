package com.wasfan.fixfastbuddy2.Garage

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.wasfan.fixfastbuddy2.R

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_login)

        val nextActivity: View = findViewById(R.id.loginbtn)

        nextActivity.setOnClickListener{
            val intent = Intent(this, Home::class.java)

            startActivity(intent)
        }
    }
}