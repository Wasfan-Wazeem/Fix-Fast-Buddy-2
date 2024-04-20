package com.wasfan.fixfastbuddy2.Garage.AdapterClasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.DataClasses.EarningPageDataClass
import com.wasfan.fixfastbuddy2.R

class EarningPageAdapter (private val dataList : ArrayList<EarningPageDataClass>

) : RecyclerView.Adapter<EarningPageAdapter.CardViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.garage_earnings_page_container, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.date.text = currentItem.dataDate
        holder.problem.text = currentItem.dataProblem
        holder.cost.text = currentItem.dataCost

    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val date : TextView = itemView.findViewById(R.id.date);
        val problem: TextView = itemView.findViewById(R.id.problem);
        val cost: TextView = itemView.findViewById(R.id.cost);


    }
}