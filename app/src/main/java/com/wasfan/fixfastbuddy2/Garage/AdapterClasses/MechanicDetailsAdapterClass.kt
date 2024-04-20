package com.wasfan.fixfastbuddy2.Garage.AdapterClasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.DataClasses.MechanicDetailsDataClass
import com.wasfan.fixfastbuddy2.R

class MechanicDetailsAdapterClass(private val dataList:ArrayList<MechanicDetailsDataClass>): RecyclerView.Adapter<MechanicDetailsAdapterClass.ViewHolderClass>(){
    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val title: TextView =itemView.findViewById(R.id.title)
        val detail: TextView =itemView.findViewById(R.id.detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.garage_mechanic_details_item_layout,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem =  dataList[position]
        holder.title.text=currentItem.dataTitle
        holder.detail.text=currentItem.dataDetail
    }
}