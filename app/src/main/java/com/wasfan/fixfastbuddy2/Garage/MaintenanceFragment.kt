package com.wasfan.fixfastbuddy2.Garage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.AdapterClass
import com.wasfan.fixfastbuddy2.Garage.DataClasses.DataClass
import com.wasfan.fixfastbuddy2.R


class MaintenanceFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList:ArrayList<DataClass>
    lateinit var imageList:Array<Int>
    lateinit var nameList:Array<String>
    lateinit var dateList:Array<String>
    lateinit var timeList:Array<String>
    lateinit var serviceList:Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        imageList = arrayOf(
            R.drawable.garage_userprofile,
            R.drawable.garage_userprofile,
            R.drawable.garage_userprofile,
            R.drawable.garage_userprofile,
            R.drawable.garage_userprofile

        )

        nameList = arrayOf(
            "Saman Perera",
            "Kasun Peiris",
            "Nimal Shantha",
            "Sunil Perera",
            "Manoj Kumar"
        )

        dateList = arrayOf(
            "Date:",
            "Date:",
            "Date:",
            "Date:",
            "Date:"
        )
        timeList = arrayOf(
            "Time:",
            "Time:",
            "Time:",
            "Time:",
            "Time:"
        )
        serviceList = arrayOf(
            "Servie: ",
            "Servie: ",
            "Servie: ",
            "Servie: ",
            "Servie: "
        )

        val view = inflater.inflate(R.layout.garage_fragment_maintenance, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf()
        getData()


        return view
    }
private fun getData(){
    for (i in imageList.indices){
        val dataClass  = DataClass(imageList[i], nameList[i], dateList[i],timeList[i],serviceList[i])
        dataList.add(dataClass)
    }
    recyclerView.adapter = AdapterClass(dataList)
}

}