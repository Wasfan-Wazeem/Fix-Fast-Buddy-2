package com.wasfan.fixfastbuddy2.Garage

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.AddServiceAdapterClass
import com.wasfan.fixfastbuddy2.Garage.DataClasses.AddServiceDataClass
import com.wasfan.fixfastbuddy2.R

class EditServices : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapterClass: AddServiceAdapterClass
    private lateinit var dataList: ArrayList<AddServiceDataClass>
    lateinit var backbutton : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_edit_services)

        recyclerView = findViewById(R.id.recyclerViewAddServices)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)


        dataList = ArrayList()

        dataList.add(AddServiceDataClass( "Jump Start"))
        dataList.add(AddServiceDataClass( "Locked Out Services"))
        dataList.add(AddServiceDataClass( "Fuel Delivery"))
        dataList.add(AddServiceDataClass( "Engine"))

        adapterClass= AddServiceAdapterClass(dataList)
        recyclerView.adapter = adapterClass

        backbutton=findViewById(R.id.backbutton)

        backbutton.setOnClickListener{
            onBackPressed()
        }

    }
}