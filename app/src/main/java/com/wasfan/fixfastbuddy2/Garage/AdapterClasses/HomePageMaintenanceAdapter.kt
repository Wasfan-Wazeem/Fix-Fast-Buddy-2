package com.wasfan.fixfastbuddy2.Garage.AdapterClasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.DataClasses.HomePageMaintenanceDataClass
import com.wasfan.fixfastbuddy2.R

class HomePageMaintenanceAdapter( private val dataList : ArrayList<HomePageMaintenanceDataClass>
) : RecyclerView.Adapter<HomePageMaintenanceAdapter.CardViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.garage_home_card_maintenance_container, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.image.setImageResource(currentItem.dataImage)
        holder.name.text = currentItem.dataName
        holder.date.text = currentItem.dataDate
        holder.time.text = currentItem.dataTime
        holder.service.text = currentItem.dataService
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.homeCardUserProfile);
        val name: TextView = itemView.findViewById(R.id.homeCardName);
        val date: TextView = itemView.findViewById(R.id.homeCardDate);
        val time: TextView = itemView.findViewById(R.id.homeCardTime);
        val service: TextView = itemView.findViewById(R.id.homeCardService);

    }
}
