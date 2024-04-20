package com.wasfan.fixfastbuddy2.Garage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.RegisterPageAdapter
import com.wasfan.fixfastbuddy2.Garage.DataClasses.RegisterPageDataClass
import com.wasfan.fixfastbuddy2.R

class RegisterPage2 : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<RegisterPageDataClass>
    private lateinit var serviceList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_register_page2)

        serviceList = arrayOf(
            "Tire",
            "Engine",
            "Jump Start",
            "Locked-out Services",
            "Fuel Delivery",
            "Brake"
        )


        recyclerView = findViewById(R.id.recyclerViewReg)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf()
        getData()

        val cont: Button = findViewById(R.id.continuebtn)

        cont.setOnClickListener{
            startActivity(Intent(this, RegisterPage3::class.java))
        }
    }

    private fun getData() {
        for (i in serviceList.indices) {
            val dataClass = RegisterPageDataClass(serviceList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = RegisterPageAdapter(dataList)
    }
}
