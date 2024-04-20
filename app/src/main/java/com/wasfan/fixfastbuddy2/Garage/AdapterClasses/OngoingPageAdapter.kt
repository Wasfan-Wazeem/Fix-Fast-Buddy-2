package com.wasfan.fixfastbuddy2.Garage.AdapterClasses


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.DataClasses.OngoingPageDataClass
import com.wasfan.fixfastbuddy2.R

class OngoingPageAdapter (private val dataList : ArrayList<OngoingPageDataClass>

) : RecyclerView.Adapter<OngoingPageAdapter.CardViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.garage_ongoing_item_layout, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.image.setImageResource(currentItem.dataImage)
        holder.name.text = currentItem.dataName
        holder.phone.text = currentItem.dataContact
        holder.vehicleVal.text = currentItem.dataVehicleVal
        holder.serviceID.text = currentItem.dataServiceID
        holder.date.text = currentItem.dataDate
        holder.time.text = currentItem.dataTime
        holder.problem.text = currentItem.dataProblem
        holder.address.text = currentItem.dataAddress
        holder.cost.text = currentItem.dataCost
        holder.status.text = currentItem.dataStatus


    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image : ImageView = itemView.findViewById(R.id.userProfile);
        val name : TextView = itemView.findViewById(R.id.name);
        val phone: TextView = itemView.findViewById(R.id.contactNumber);
        val vehicleVal: TextView = itemView.findViewById(R.id.vehicleVal);
        val serviceID: TextView = itemView.findViewById(R.id.serviceID);
        val date: TextView = itemView.findViewById(R.id.date);
        val time: TextView = itemView.findViewById(R.id.time);
        val problem: TextView = itemView.findViewById(R.id.problemVal);
        val address: TextView = itemView.findViewById(R.id.addressVal);
        val cost: TextView = itemView.findViewById(R.id.totalCost);
        val status: TextView = itemView.findViewById(R.id.status);


    }
}