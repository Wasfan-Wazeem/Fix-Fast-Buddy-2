package com.wasfan.fixfastbuddy2.Garage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.wasfan.fixfastbuddy2.R

class RegisterPage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_register_page1)


        val cont: Button = findViewById(R.id.continuebtn)

        cont.setOnClickListener{
            startActivity(Intent(this, RegisterPage2::class.java))
        }
    }
}