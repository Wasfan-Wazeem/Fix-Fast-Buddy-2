package com.wasfan.fixfastbuddy2.Garage
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.PrAdapterClass
import com.wasfan.fixfastbuddy2.Garage.DataClasses.PrDataClass
import com.wasfan.fixfastbuddy2.R

class ProfilePage : AppCompatActivity() {

    private lateinit var recyclerView1: RecyclerView
    private lateinit var dataList: ArrayList<PrDataClass>
    lateinit var titleList: Array<String>
    lateinit var detailsList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_profile_page)

        titleList = arrayOf(
            "Name",
            "Email",
            "Phone Number",
            "Date Joined",
            "Total Services Completed",
            "No of Mechanics"


        )

        detailsList = arrayOf(
            "Samarasiri Garage",
            "nimal@gmail.com",
            "+94 72 234 5656",
            "29.09.2021",
            "150",
            "10"
        )

        recyclerView1 = findViewById(R.id.recyclerViewUserAccount)

        recyclerView1.layoutManager = LinearLayoutManager(this)
        recyclerView1.setHasFixedSize(true)

        dataList = arrayListOf()
        getData()
    }

    private fun getData() {
        for (i in titleList.indices) {
            val dataClass = PrDataClass(titleList[i], detailsList[i])
            dataList.add(dataClass)
        }
        recyclerView1.adapter = PrAdapterClass(dataList)
    }
}