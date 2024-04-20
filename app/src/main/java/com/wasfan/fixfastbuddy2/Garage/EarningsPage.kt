package com.wasfan.fixfastbuddy2.Garage

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.EarningPageAdapter
import com.wasfan.fixfastbuddy2.Garage.DataClasses.EarningPageDataClass
import com.wasfan.fixfastbuddy2.R

class EarningsPage : AppCompatActivity() {

    private lateinit var recyclerViewEarnings: RecyclerView
    private lateinit var dataList:ArrayList<EarningPageDataClass>
    lateinit var dateList:Array<String>
    lateinit var problemList:Array<String>
    lateinit var costList:Array<String>
    private lateinit var backbutton : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_earnings_page)

        dateList = arrayOf(
            "10/10/2023",
            "10/10/2023",
            "10/10/2023",
            "10/10/2023"

        )

        problemList = arrayOf(
            "Brake",
            "Tire",
            "Engine",
            "Brake"
        )

        costList = arrayOf(
            "Rs. 250",
            "Rs. 250",
            "Rs. 250",
            "Rs. 250"
        )

        recyclerViewEarnings = findViewById(R.id.recyclerViewEarnings)

        recyclerViewEarnings.layoutManager = LinearLayoutManager(this)
        recyclerViewEarnings.setHasFixedSize(true)

        dataList = arrayListOf()
        getData()

        backbutton=findViewById(R.id.backbutton)

        backbutton.setOnClickListener{
            onBackPressed()
        }

    }

    private fun getData() {
        for (i in dateList.indices) {
            val dataClass = EarningPageDataClass(dateList[i],problemList[i],costList[i])
            dataList.add(dataClass)
        }
        recyclerViewEarnings.adapter = EarningPageAdapter(dataList)
    }
}
