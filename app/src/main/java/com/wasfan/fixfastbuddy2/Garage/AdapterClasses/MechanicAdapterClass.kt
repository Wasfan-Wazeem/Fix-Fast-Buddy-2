package com.wasfan.fixfastbuddy2.Garage.AdapterClasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.DataClasses.MechanicDataClass
import com.wasfan.fixfastbuddy2.R

class MechanicAdapterClass (private val dataList:ArrayList<MechanicDataClass>): RecyclerView.Adapter<MechanicAdapterClass.ViewHolderClass>() {

    var onItemClick : ((MechanicDataClass) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.garage_mechanic_item_page,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem =  dataList[position]
        holder.image.setImageResource(currentItem.dataImage)
        holder.name.text=currentItem.dataName

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(currentItem)

        }

    }

    class ViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.mechanicProfile)
        val name: TextView = itemView.findViewById(R.id.mechanicName)
    }
}
