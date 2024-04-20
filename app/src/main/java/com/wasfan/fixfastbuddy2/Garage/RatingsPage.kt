package com.wasfan.fixfastbuddy2.Garage

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.RatingAdapterClass
import com.wasfan.fixfastbuddy2.Garage.DataClasses.RatingDataClass
import com.wasfan.fixfastbuddy2.R


class RatingsPage : AppCompatActivity() {

    private lateinit var recyclerViewRatings: RecyclerView
    private lateinit var dataList: ArrayList<RatingDataClass>
    private lateinit var adapterClass: RatingAdapterClass
    private lateinit var nameList: Array<String>
    private lateinit var dateList: Array<String>
    private lateinit var commentsList: Array<String>
    private lateinit var backbutton:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_ratings_page)




        nameList = arrayOf(
            "Saman Perera",
            "Kasun Peiris",
            "Nimal Shantha",
            "Sunil Perera"
        )

        dateList = arrayOf(
            "30/04/2023",
            "20/03/2022",
            "20/03/2022",
            "20/03/2022"
        )

        commentsList = arrayOf(
            "Good Service",
            "Excellent Service",
            "Will try next time as well",
            "Superbly Done"
        )

        recyclerViewRatings = findViewById(R.id.recyclerViewRatings)
        recyclerViewRatings.layoutManager = LinearLayoutManager(this)
        recyclerViewRatings.setHasFixedSize(true)

        dataList = arrayListOf()
        getData()

        backbutton=findViewById(R.id.backbutton)

        backbutton.setOnClickListener{
            onBackPressed()
        }

    }



    private fun getData() {
        for (i in nameList.indices) {
            val dataClass = RatingDataClass(nameList[i], dateList[i], commentsList[i])
            dataList.add(dataClass)
        }
        recyclerViewRatings.adapter = RatingAdapterClass(dataList)
    }


}


