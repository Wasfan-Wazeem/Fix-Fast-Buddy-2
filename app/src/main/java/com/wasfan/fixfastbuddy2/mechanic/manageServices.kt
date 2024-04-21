package com.wasfan.fixfastbuddy2.mechanic

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.R
import com.wasfan.fixfastbuddy2.mechanic.AdapterClass.AdapterClassMS
import com.wasfan.fixfastbuddy2.mechanic.DataClass.DataClassMS



class manageServices : AppCompatActivity() {

    private lateinit var backbtn3: ImageView
    private lateinit var editMS:ImageView
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClassMS>
    private lateinit var adapterClass : AdapterClassMS


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_services)


        recyclerView = findViewById(R.id.mngservices_rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = ArrayList()

        dataList.add(DataClassMS( "Jump Start"))
        dataList.add(DataClassMS( "Locked Out Services"))
        dataList.add(DataClassMS( "Fuel Delivery"))
        dataList.add(DataClassMS( "Engine"))

        adapterClass= AdapterClassMS(dataList)
        recyclerView.adapter = adapterClass

// Inside your activity's onCreate method or wherever appropriate
        editMS = findViewById(R.id.EditMS)
        editMS.setOnClickListener {
            // Create an Intent to navigate to the Edit Services activity
            startActivity(Intent(this@manageServices, EditServices::class.java))
        }

        backbtn3 = findViewById(R.id.backBtn3)
        backbtn3.setOnClickListener {
            onBackPressed()}


    }
}

