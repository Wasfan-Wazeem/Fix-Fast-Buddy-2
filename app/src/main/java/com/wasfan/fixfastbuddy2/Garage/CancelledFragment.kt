package com.wasfan.fixfastbuddy2.Garage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.CancelledPageAdapter
import com.wasfan.fixfastbuddy2.Garage.DataClasses.CancelledDataClass
import com.wasfan.fixfastbuddy2.R


class CancelledFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList:ArrayList<CancelledDataClass>
    lateinit var dateList:Array<String>
    lateinit var nameList:Array<String>
    lateinit var problemList : Array<String>
    lateinit var serviceIDList : Array<String>




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        dateList = arrayOf(
            "25.08.2023",
            "05.09.2023",
            "10.10.2023",
            "30.10.2023"
        )

        serviceIDList = arrayOf(
            "S001",
            "S002",
            "S003",
            "S004"
        )

        nameList = arrayOf(
            "Saman Perera",
            "Kasun Peiris",
            "Nimal Shantha",
            "Sunil Perera"

        )


        problemList = arrayOf(
            "Tire",
            "Tire",
            "Tire",
            "Tire"
        )


        val view = inflater.inflate(R.layout.garage_fragment_cancelled, container, false)
        recyclerView = view.findViewById(R.id.recyclerViewCancel)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf()
        getData()


        return view
    }

    private fun getData(){
        for (i in dateList.indices){
            val dataClass  =
                CancelledDataClass(dateList[i],serviceIDList[i], nameList[i],problemList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = CancelledPageAdapter(dataList)
    }


}