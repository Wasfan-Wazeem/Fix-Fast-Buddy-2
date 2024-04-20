package com.wasfan.fixfastbuddy2.mechanic.AdapterClass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.R
import com.wasfan.fixfastbuddy2.mechanic.AdapterClass.HomeRequestAdapterClass

import com.wasfan.fixfastbuddy2.mechanic.DataClass.HomeRequestDataClass

class HomeRequestAdapterClass(private val dataList : ArrayList<HomeRequestDataClass>):
    RecyclerView.Adapter<HomeRequestAdapterClass.ViewHolderClass>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_requests_layout,parent,false)
        return HomeRequestAdapterClass.ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem =  dataList[position]
        holder.name.text=currentItem.dataName
        holder.contact.text=currentItem.dataContact
        holder.vehicle.text = currentItem.dataVehicle
        holder.problem.text = currentItem.dataProblem
        holder.distance.text = currentItem.dataDistance
        holder.address.text = currentItem.dataAddress
        holder.travelingCost.text = currentItem.dataTravelingCost
        holder.inspectionCost.text = currentItem.dataInspectionCost
    }

    class ViewHolderClass (itemView: View):RecyclerView.ViewHolder(itemView){

        val name: TextView = itemView.findViewById(R.id.name)
        val contact: TextView = itemView.findViewById(R.id.contactNumber)
        val vehicle: TextView = itemView.findViewById(R.id.vehicleVal)
        val problem: TextView = itemView.findViewById(R.id.problemVal)
        val distance: TextView = itemView.findViewById(R.id.distanceVal)
        val address: TextView = itemView.findViewById(R.id.addressVal)
        val travelingCost: TextView = itemView.findViewById(R.id.travelingCost)
        val inspectionCost: TextView = itemView.findViewById(R.id.inspectionCost)


    }
}