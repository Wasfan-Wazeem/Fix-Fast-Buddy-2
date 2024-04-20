package com.wasfan.fixfastbuddy2.Garage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.OngoingPageAdapter
import com.wasfan.fixfastbuddy2.Garage.DataClasses.OngoingPageDataClass
import com.wasfan.fixfastbuddy2.R


class OngoingFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList:ArrayList<OngoingPageDataClass>
    lateinit var imageList:Array<Int>
    lateinit var nameList:Array<String>
    lateinit var contactList:Array<String>
    lateinit var vehicleValList:Array<String>
    lateinit var serviceIDList : Array<String>
    lateinit var dateList : Array<String>
    lateinit var timeList : Array<String>
    lateinit var problemList : Array<String>
    lateinit var addressList : Array<String>
    lateinit var costList : Array<String>
    lateinit var statusList : Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        imageList = arrayOf(
            R.drawable.garage_mechanic_profile,
            R.drawable.garage_mechanic_profile,
            R.drawable.garage_mechanic_profile,
            R.drawable.garage_mechanic_profile

        )

        nameList = arrayOf(
            "Saman Perera",
            "Kasun Peiris",
            "Nimal Shantha",
            "Sunil Perera"

        )


        contactList = arrayOf(
            "+94 72 250 1919",
            "+94 72 250 1919",
            "+94 72 250 1919",
            "+94 72 250 1919"
        )

        vehicleValList = arrayOf(
            "BMW - 3110",
            "Suzuki - 4221",
            "Suzuki - 4221",
            "Suzuki - 4221"

        )

        serviceIDList = arrayOf(
            "S002",
            "3003",
            "3004",
            "3005"
        )

        dateList = arrayOf(
            "2023-05-24",
            "2023-06-27",
            "2023-07-03",
            "2023-07-24"
        )

        timeList = arrayOf(
            "15:25:23",
            "16:25:23",
            "17:25:23",
            "20:25:23"
        )

        problemList = arrayOf(
            "Split Tire ",
            "Engine",
            "Engine",
            "Split Tire"

        )

        addressList = arrayOf(
            "32, Galle Road, Colombo 04",
            "32, Galle Road, Colombo 04",
            "32, Galle Road, Colombo 04",
            "32, Galle Road, Colombo 04"

        )

        costList = arrayOf(
            "Rs. 250",
            "Rs. 250",
            "Rs. 250",
            "Rs. 250"
        )


        statusList = arrayOf(
            "Ongoing",
            "Inspecting",
            "Ongoing",
            "Completed"
        )

        val view = inflater.inflate(R.layout.garage_fragment_ongoing, container, false)
        recyclerView = view.findViewById(R.id.recyclerViewOngoing)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf()
        getData()


        return view
    }

    private fun getData(){
        for (i in imageList.indices){
            val dataClass  = OngoingPageDataClass(imageList[i], nameList[i], contactList[i],vehicleValList[i],serviceIDList[i],dateList[i],timeList[i],problemList[i],addressList[i],costList[i],statusList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = OngoingPageAdapter(dataList)
    }


}