package com.wasfan.fixfastbuddy2.mechanic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.R
import com.wasfan.fixfastbuddy2.mechanic.AdapterClass.CompletedTaskAdapter
import com.wasfan.fixfastbuddy2.mechanic.DataClass.CompletedDataClass


//2 new lines


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

//

//// TODO: Rename parameter arguments, choose names that match
//// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"
//
///**
// * A simple [Fragment] subclass.
// * Use the [completed.newInstance] factory method to
// * create an instance of this fragment.
// */
class completed : Fragment() {
//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }


    // new

    private var param1: String? = null
    private var param2: String? = null
    private lateinit var adapter: CompletedTaskAdapter
    private lateinit var recyclerView: RecyclerView

    //

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_completed, container, false)
//    }
//}
////    companion object {
////        /**
////         * Use this factory method to create a new instance of
////         * this fragment using the provided parameters.
////         *
////         * @param param1 Parameter 1.
////         * @param param2 Parameter 2.
////         * @return A new instance of fragment completed.
////         */
////        // TODO: Rename and change types and number of parameters
////        @JvmStatic
////        fun newInstance(param1: String, param2: String) =
////            completed().apply {
////                arguments = Bundle().apply {
////                    putString(ARG_PARAM1, param1)
////                    putString(ARG_PARAM2, param2)
////                }
////            }
////    }
////}




//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val view =inflater.inflate(R.layout.fragment_completed, container, false)
//        recyclerView = view.findViewById(R.id.rvCompleted)
//        return view
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        recyclerView.layoutManager = LinearLayoutManager(requireContext())
//        val CompletedDataClass = listOf(
//            CompletedDataClass("Alex", "01/01/2023", "Tire"),
//            CompletedDataClass("Mathew", "02/01/2023", "Fuel"),
//            CompletedDataClass("Dasuni", "03/01/2023", "Engine")
//        )
//
//
//        adapter = CompletedTaskAdapter(CompletedDataClass, requireFragmentManager())
//        recyclerView.adapter = adapter
//    }
//
//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment CompletedFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            completed().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
//}

    private lateinit var tasks: ArrayList<CompletedDataClass>
    private lateinit var imageList: Array<Int>
    private lateinit var serviceID: Array<String>
    private lateinit var serviceType: Array<String>
    private lateinit var vehicleNum: Array<String>
    private lateinit var address: Array<String>
    private lateinit var date: Array<String>
    // private lateinit var time: Array<String>
    private lateinit var completedAmount: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_completed, container, false)

        initLists()

        recyclerView = view.findViewById(R.id.rvCompleted)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)

        tasks = arrayListOf<CompletedDataClass>()
        getData()

        return view
    }

    private fun getData(){
        for(i in imageList.indices){
            val dataClass = CompletedDataClass(imageList[i], serviceID[i], serviceType[i], vehicleNum[i], address[i], date[i],/* time[i],*/ completedAmount[i])
            tasks.add(dataClass)
        }
        recyclerView.adapter = CompletedTaskAdapter(tasks)
    }

    private fun initLists(){
        imageList = arrayOf(
            R.drawable.service_icon,
            R.drawable.service_icon
        )

        serviceID = arrayOf(
            "S15518209",
            "S16251325"
        )

        serviceType = arrayOf(
            "Tyre",
            "Engine"
        )

        vehicleNum = arrayOf(
            "CAC-0282",
            "CBH-0484"
        )

        address = arrayOf(
            "123-131 Philip Gunawardena Mawatha, Colombo 00400",
            "252 2/1 Matale Road Katugastota"
        )

        date = arrayOf(
            "2023-10-21",
            "2024-01-01"
        )

//        time = arrayOf(
//            "17:23:29",
//            "20:16:47"
//        )

        completedAmount = arrayOf(
            "LKR 2,150.00",
            "LKR 950.00"
        )
    }

}