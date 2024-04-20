package com.wasfan.fixfastbuddy2.Garage.AdapterClasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.DataClasses.DataClass
import com.wasfan.fixfastbuddy2.R

class AdapterClass(private val dataList: ArrayList<DataClass>):RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.garage_maintenance_item_layout,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem =  dataList[position]
        holder.image.setImageResource(currentItem.dataImage)
        holder.name.text=currentItem.dataName
        holder.date.text=currentItem.dataDate
        holder.time.text=currentItem.dataTime
        holder.service.text=currentItem.dataService
    }
    class ViewHolderClass (itemView: View):RecyclerView.ViewHolder(itemView) {
        val image:ImageView =itemView.findViewById(R.id.userProfile)
        val name:TextView = itemView.findViewById(R.id.name)
        val date:TextView = itemView.findViewById(R.id.date)
        val time:TextView = itemView.findViewById(R.id.time)
        val service:TextView = itemView.findViewById(R.id.service)

    }
}