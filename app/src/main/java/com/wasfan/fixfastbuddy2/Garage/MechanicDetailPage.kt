package com.wasfan.fixfastbuddy2.Garage

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.MechanicDetailsAdapterClass
import com.wasfan.fixfastbuddy2.Garage.DataClasses.MechanicDataClass
import com.wasfan.fixfastbuddy2.Garage.DataClasses.MechanicDetailsDataClass
import com.wasfan.fixfastbuddy2.R

class MechanicDetailPage : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<MechanicDetailsDataClass>
    lateinit var titleList: Array<String>
    lateinit var detailsList: Array<String>
    lateinit var backbutton : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_mechanic_detail_page)

        titleList = arrayOf(
            "Name",
            "Email",
            "Phone Number",
            "Date Joined",
            "Total Services Completed"



        )

        detailsList = arrayOf(
            "Samarasiri Garage",
            "nimal@gmail.com",
            "+94 72 234 5656",
            "29.09.2021",
            "150"
        )

        recyclerView = findViewById(R.id.recyclerViewMechanicDetails)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf()
        getData()

        backbutton=findViewById(R.id.backbutton)

        backbutton.setOnClickListener{
            onBackPressed()
        }

        val currentItem = intent.getParcelableExtra<MechanicDataClass>("currentItem")
        if (currentItem!=null){
            val imageView : ImageView = findViewById(R.id.mechanicDetailIv)
            val recyclerView : RecyclerView = findViewById(R.id.recyclerViewMechanicDetails)

            imageView.setImageResource(currentItem.dataImage)


        }
    }

    private fun getData() {
        for (i in titleList.indices) {
            val dataClass = MechanicDetailsDataClass(titleList[i], detailsList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = MechanicDetailsAdapterClass(dataList)
    }
}