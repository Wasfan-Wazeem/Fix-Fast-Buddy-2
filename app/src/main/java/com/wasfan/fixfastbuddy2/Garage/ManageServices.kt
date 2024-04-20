package com.wasfan.fixfastbuddy2.Garage

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.ManageServceAdapterClass
import com.wasfan.fixfastbuddy2.Garage.DataClasses.ManageServiceDataClass
import com.wasfan.fixfastbuddy2.R

class ManageServices : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList : ArrayList<ManageServiceDataClass>
    private lateinit var adapterClass : ManageServceAdapterClass
    private lateinit var editBtn : ImageView
    lateinit var backbutton : ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_manage_services)


        recyclerView = findViewById(R.id.serviceRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)


        dataList = ArrayList()

        dataList.add(ManageServiceDataClass( "Jump Start"))
        dataList.add(ManageServiceDataClass( "Locked Out Services"))
        dataList.add(ManageServiceDataClass( "Fuel Delivery"))
        dataList.add(ManageServiceDataClass( "Engine"))

        adapterClass= ManageServceAdapterClass(dataList)
        recyclerView.adapter = adapterClass

        editBtn = findViewById(R.id.editBtn)

        editBtn.setOnClickListener{
            startActivity(Intent(this, EditServices::class.java))

        }
        backbutton=findViewById(R.id.backbutton)

        backbutton.setOnClickListener{
            onBackPressed()
        }
    }
}