package com.wasfan.fixfastbuddy2.Garage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.wasfan.fixfastbuddy2.R


class otp_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.garage_activity_otp_login)

        val emailInstead: TextView = findViewById(R.id.emailInstead)


        emailInstead.setOnClickListener {

            startActivity(Intent(this, Login::class.java))

        }

        val nextbtn :Button=findViewById(R.id.otploginbtn)

        nextbtn.setOnClickListener{
            startActivity(Intent(this, RegisterPage1::class.java))
        }
    }
}