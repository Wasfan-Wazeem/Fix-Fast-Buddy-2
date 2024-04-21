package com.wasfan.fixfastbuddy2.mechanic.AdapterClass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.R
import com.wasfan.fixfastbuddy2.mechanic.DataClass.CompletedDataClass

class CompletedTaskAdapter(private val tasks: ArrayList<CompletedDataClass>)/*,private val fragmentManager: FragmentManager)*/ :
RecyclerView.Adapter<CompletedTaskAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): CompletedTaskAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_completed, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        val task = tasks[position]
//        holder.bind(task)
        val currentItem = tasks[position]
        holder.image.setImageResource(currentItem.image)
        holder.serviceID.text = currentItem.serviceID
        holder.serviceType.text = currentItem.serviceType
        holder.vehicleNum.text = currentItem.vehicleNum
        holder.address.text = currentItem.address
        holder.date.text = currentItem.date
//        holder.time.text = currentItem.time
        holder.completedAmount.text = currentItem.completedAmount



    }
    override fun getItemCount(): Int {
        return tasks.size
    }


    /*inner*/ class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val image: ImageView = itemView.findViewById(R.id.completedImage)
         val serviceID: TextView = itemView.findViewById(R.id.completedServiceID)
         val serviceType: TextView = itemView.findViewById(R.id.completedServiceType)
         val vehicleNum: TextView = itemView.findViewById(R.id.completedVehicle)
         val address: TextView = itemView.findViewById(R.id.completedAddress)
         val date: TextView = itemView.findViewById(R.id.completedDate)
        // /private/ val time: TextView = itemView.findViewById(R.id.completedVehicle)
        val completedAmount: TextView = itemView.findViewById(R.id.completedAmount)

    }
}