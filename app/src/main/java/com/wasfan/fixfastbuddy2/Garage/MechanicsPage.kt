package com.wasfan.fixfastbuddy2.Garage

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.AdapterClasses.MechanicAdapterClass
import com.wasfan.fixfastbuddy2.Garage.DataClasses.MechanicDataClass
import com.wasfan.fixfastbuddy2.R

class MechanicsPage : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList : ArrayList<MechanicDataClass>
    private lateinit var adapterClass: MechanicAdapterClass
    private lateinit var addMechanicBtn : ImageView
    private lateinit var backbutton  : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garage_activity_mechanics_page)


        recyclerView = findViewById(R.id.mechanicRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)


        dataList = ArrayList()

        dataList.add(MechanicDataClass(R.drawable.garage_mechanicprofile, "Kasun Perera"))
        dataList.add(MechanicDataClass(R.drawable.garage_mechanicprofile, "Sunil Peiris"))
        dataList.add(MechanicDataClass(R.drawable.garage_mechanicprofile, "Anjana Perera"))
        dataList.add(MechanicDataClass(R.drawable.garage_mechanicprofile, "Nadeesh Sunil"))

        adapterClass= MechanicAdapterClass(dataList)
        recyclerView.adapter = adapterClass


        adapterClass.onItemClick = {
            val intent = Intent(this, MechanicDetailPage::class.java)
            intent.putExtra("currentItem",it)
            startActivity(intent)
        }

        addMechanicBtn = findViewById(R.id.addMechanicBtn)

        addMechanicBtn.setOnClickListener {
            startActivity(Intent(this, AddMechanics::class.java))
        }

        backbutton=findViewById(R.id.backbutton)

        backbutton.setOnClickListener{
            onBackPressed()
        }



    }

}