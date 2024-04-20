package com.wasfan.fixfastbuddy2.Garage.AdapterClasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.DataClasses.ManageServiceDataClass
import com.wasfan.fixfastbuddy2.R

class ManageServceAdapterClass(private val dataList : ArrayList<ManageServiceDataClass>):RecyclerView.Adapter<ManageServceAdapterClass.ViewHolderClass>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.garage_services_card_layout,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem =  dataList[position]
        holder.service.text=currentItem.dataService
    }

class ViewHolderClass (itemView: View):RecyclerView.ViewHolder(itemView){
    val service: TextView = itemView.findViewById(R.id.service)

}
}