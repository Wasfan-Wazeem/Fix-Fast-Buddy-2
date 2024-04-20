package com.wasfan.fixfastbuddy2.Garage.AdapterClasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.DataClasses.RegisterPageDataClass
import com.wasfan.fixfastbuddy2.R

class RegisterPageAdapter (private val dataList : ArrayList<RegisterPageDataClass>

) : RecyclerView.Adapter<RegisterPageAdapter.CardViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.garage_register_page_item_layout, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.service.text = currentItem.dataService


    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val service : TextView = itemView.findViewById(R.id.service);



    }
}