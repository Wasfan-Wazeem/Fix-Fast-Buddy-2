package com.wasfan.fixfastbuddy2.Garage

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.HomePageMaintenanceAdapter
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.HomePagerAdapter
import com.wasfan.fixfastbuddy2.Garage.DataClasses.HomePageDataClass
import com.wasfan.fixfastbuddy2.Garage.DataClasses.HomePageMaintenanceDataClass
import com.wasfan.fixfastbuddy2.R
import kotlin.math.abs

class HomeFragment : Fragment() {

    private lateinit var viewPager2: ViewPager2
    private lateinit var viewPager3: ViewPager2
    private lateinit var handler: Handler
    private lateinit var dataList: ArrayList<HomePageDataClass>
    private lateinit var dataList2:ArrayList<HomePageMaintenanceDataClass>
    private lateinit var imageList: Array<Int>
    private lateinit var nameList: Array<String>
    private lateinit var starList: Array<Int>
    private lateinit var ratingList: Array<String>
    private lateinit var locationList: Array<String>
    private lateinit var problemList: Array<String>
    private lateinit var statusList: Array<String>
    private lateinit var imageList2 : Array<Int>
    private lateinit var nameList2 : Array<String>
    private lateinit var dateList :Array<String>
    private lateinit var timeList : Array<String>
    private lateinit var serviceList : Array<String>
    private lateinit var adapter: HomePagerAdapter
    private lateinit var adapter2: HomePageMaintenanceAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        imageList = arrayOf(
            R.drawable.garage_mechanicprofile,
            R.drawable.garage_mechanicprofile,
            R.drawable.garage_mechanicprofile,
            R.drawable.garage_mechanicprofile,
        )

        nameList = arrayOf(
            "Saman Perera",
            "Kasun Peiris",
            "Nimal Shantha",
            "Sunil Perera"

        )

        starList = arrayOf(
            R.drawable.garage_star_shape,
            R.drawable.garage_star_shape,
            R.drawable.garage_star_shape,
            R.drawable.garage_star_shape
        )

        ratingList = arrayOf(
            "4.9",
            "4.9",
            "4.9",
            "4.9"
        )

        locationList = arrayOf(
            "Location : ",
            "Location : ",
            "Location : ",
            "Location : "
        )

        problemList = arrayOf(
            "Problem : ",
            "Problem : ",
            "Problem : ",
            "Problem : "

        )

        statusList = arrayOf(
            "Status : ",
            "Status : ",
            "Status : ",
            "Status : "
        )

        imageList2 = arrayOf(
            R.drawable.garage_card_userprofile,
            R.drawable.garage_card_userprofile,
            R.drawable.garage_card_userprofile,
            R.drawable.garage_card_userprofile
        )

        nameList2 = arrayOf(
            "Saman Perera",
            "Kasun Peiris",
            "Nimal Shantha",
            "Sunil Perera"

        )

        dateList = arrayOf(
            "Date : ",
            "Date : ",
            "Date : ",
            "Date : "
        )

        timeList = arrayOf(
            "Time : ",
            "Time : ",
            "Time : ",
            "Time : "
        )

        serviceList = arrayOf(
            "Service : ",
            "Service : ",
            "Service : ",
            "Service : "
        )

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.garage_fragment_home, container, false)
        viewPager2 = view.findViewById(R.id.homeViewPager)  // Initialize ViewPager
        viewPager3 = view.findViewById(R.id.homeViewPager2) //Initialize second viewpager
        handler = Handler(Looper.myLooper()!!)

        dataList = arrayListOf()
        getData()

        dataList2 = arrayListOf()
        getData2()

        adapter = HomePagerAdapter(dataList)
        adapter2 = HomePageMaintenanceAdapter(dataList2)

        viewPager2.adapter = adapter
        viewPager2.offscreenPageLimit = 4
        viewPager2.clipToPadding = false
        viewPager2.clipChildren = false
        viewPager2.getChildAt(0)?.overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        //maintenance view pager
        viewPager3.adapter = adapter
        viewPager3.offscreenPageLimit = 4
        viewPager3.clipToPadding = false
        viewPager3.clipChildren = false
        viewPager3.getChildAt(0)?.overScrollMode = RecyclerView.OVER_SCROLL_NEVER



        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                handler.removeCallbacksAndMessages(null)
            }
        })

        viewPager3.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                handler.removeCallbacksAndMessages(null)
            }
        })

        setUpTransformer()
        setUpTransformer2()
        return view
    }


    override fun onPause() {
        super.onPause()
        handler.removeCallbacksAndMessages(null)
    }



    private fun setUpTransformer() {
        val transformer = CompositePageTransformer()
        transformer.addTransformer(MarginPageTransformer(40))
        transformer.addTransformer { page, position ->
            val r = 1 - abs(position)
            page.scaleY = 0.85f + r * 0.14f
        }
        viewPager2.setPageTransformer(transformer)
    }

    private fun setUpTransformer2() {
        val transformer = CompositePageTransformer()
        transformer.addTransformer(MarginPageTransformer(40))
        transformer.addTransformer { page, position ->
            val r = 1 - abs(position)
            page.scaleY = 0.85f + r * 0.14f
        }
        viewPager3.setPageTransformer(transformer)
    }

    private fun getData() {
        for (i in imageList.indices) {
            val dataClass = HomePageDataClass(
                imageList[i],
                nameList[i],
                starList[i],
                ratingList[i],
                locationList[i],
                problemList[i],
                statusList[i]
            )
            dataList.add(dataClass)
        }

    }

    private fun getData2() {
        for (i in imageList2.indices) {
            val dataClass = HomePageMaintenanceDataClass(
                imageList2[i],
                nameList2[i],
                dateList[i],
                timeList[i],
                serviceList[i]
            )
            dataList2.add(dataClass)
        }

    }

}

