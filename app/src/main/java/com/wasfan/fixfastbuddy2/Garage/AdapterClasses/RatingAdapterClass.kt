package com.wasfan.fixfastbuddy2.Garage.AdapterClasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.DataClasses.RatingDataClass
import com.wasfan.fixfastbuddy2.R

class RatingAdapterClass(private val dataList : ArrayList<RatingDataClass>):RecyclerView.Adapter<RatingAdapterClass.ViewHolderClass>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.garage_ratings_card_container,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem =  dataList[position]
        holder.name.text=currentItem.dataName
        holder.date.text=currentItem.dataDate
        holder.comments.text = currentItem.dataComments
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolderClass (itemView: View):RecyclerView.ViewHolder(itemView){
        val name:TextView = itemView.findViewById(R.id.ratingCardName)
        val date: TextView = itemView.findViewById(R.id.ratingCardDate)
        val comments:TextView=itemView.findViewById(R.id.ratingCardComments)

    }

}