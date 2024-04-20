package com.wasfan.fixfastbuddy2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.wasfan.fixfastbuddy2.mechanic.Navigation
import com.wasfan.fixfastbuddy2.mechanic.Phone
import com.wasfan.fixfastbuddy2.mechanic.RetrofitInstance
import com.wasfan.fixfastbuddy2.mechanic.SignUpInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SplashScreen : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private val currentUser = FirebaseAuth.getInstance().currentUser

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        auth = FirebaseAuth.getInstance()

        Handler(Looper.getMainLooper()).postDelayed({
            // Start the main activity
            val phoneNumber = currentUser?.phoneNumber
            if (auth.currentUser != null && !phoneNumber.isNullOrBlank()) {
                checkMechanicInDatabase(phoneNumber)
                checkGarageMechanicInDatabase(phoneNumber)
            } else {
                startActivity(Intent(this, Navigation::class.java))
                finish()
            }
        }, 3000)
    }

    private fun checkMechanicInDatabase(phoneNumber: String) {

        val apiService = RetrofitInstance.api

        val call = apiService.checkMechanic(phoneNumber)

        call.enqueue(object : Callback<Boolean> {
            override fun onResponse(call: Call<Boolean>, response: Response<Boolean>) {
                if (response.isSuccessful) {
                    val isAvailable = response.body() ?: false
                    if (isAvailable) {
                        // Phone number exists in the database
                        Toast.makeText(this@SplashScreen, "Mechanic phone number exists", Toast.LENGTH_SHORT)
                            .show()
                        startActivity(Intent(this@SplashScreen, Navigation::class.java))
                        finish()
                    } else {
                        // Phone number does not exist in the database
                        Toast.makeText(
                            this@SplashScreen,
                            "Mechanic phone number does not exist",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    // Handle error response
                    Toast.makeText(
                        this@SplashScreen,
                        "Error checking phone number",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            override fun onFailure(call: Call<Boolean>, t: Throwable) {
                // Handle network or unexpected errors
                Toast.makeText(this@SplashScreen, "Network error", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun checkGarageMechanicInDatabase(phoneNumber: String) {

        val apiService = RetrofitInstance.api

        val call = apiService.checkGarageMechanic(phoneNumber)

        call.enqueue(object : Callback<Boolean> {
            override fun onResponse(call: Call<Boolean>, response: Response<Boolean>) {
                if (response.isSuccessful) {
                    val isAvailable = response.body() ?: false
                    if (isAvailable) {
                        // Phone number exists in the database
                        Toast.makeText(this@SplashScreen, "Garage Mechanic phone number exists", Toast.LENGTH_SHORT)
                            .show()
                        startActivity(Intent(this@SplashScreen, Navigation::class.java))
                        finish()
                    } else {
                        // Phone number does not exist in the database
                        Toast.makeText(
                            this@SplashScreen,
                            "Garage Mechanic phone number does not exist",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    // Handle error response
                    Toast.makeText(
                        this@SplashScreen,
                        "Error checking phone number",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            override fun onFailure(call: Call<Boolean>, t: Throwable) {
                // Handle network or unexpected errors
                Toast.makeText(this@SplashScreen, "Network error", Toast.LENGTH_SHORT).show()
            }
        })
    }

}