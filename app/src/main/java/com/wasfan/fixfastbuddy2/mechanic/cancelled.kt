package com.wasfan.fixfastbuddy2.mechanic
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.R
import com.wasfan.fixfastbuddy2.mechanic.AdapterClass.CancelledTaskAdapter
import com.wasfan.fixfastbuddy2.mechanic.DataClass.CancelledTask


class cancelled : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList:ArrayList<CancelledTask>
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


        val view = inflater.inflate(R.layout.fragment_cancelled, container, false)
        recyclerView = view.findViewById(R.id.recyclerViewCancel)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf()
        getData()


        return view
    }

    private fun getData(){
        for (i in dateList.indices){
            val dataClass  =CancelledTask(dateList[i],serviceIDList[i], nameList[i],problemList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = CancelledTaskAdapter(dataList)
    }


}