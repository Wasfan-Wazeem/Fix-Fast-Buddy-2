package com.wasfan.fixfastbuddy2.Garage.AdapterClasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.wasfan.fixfastbuddy2.Garage.DataClasses.AddServiceDataClass
import com.wasfan.fixfastbuddy2.R

class AddServiceAdapterClass(private val dataList : ArrayList<AddServiceDataClass>) : RecyclerView.Adapter<AddServiceAdapterClass.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.garage_add_service_item_layout, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.service.text = currentItem.dataService

    }

    class CardViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val service : TextView = itemView.findViewById(R.id.service);
    }

}