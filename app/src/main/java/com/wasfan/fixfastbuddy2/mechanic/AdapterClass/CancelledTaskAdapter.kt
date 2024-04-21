package com.wasfan.fixfastbuddy2.mechanic.AdapterClass
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.R
import com.wasfan.fixfastbuddy2.mechanic.DataClass.CancelledTask

class CancelledTaskAdapter (private val dataList : ArrayList<CancelledTask>

) : RecyclerView.Adapter<CancelledTaskAdapter.CardViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cancelled_item_layout, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.date.text = currentItem.dataDate
        holder.serviceID.text = currentItem.dataServiceID
        holder.name.text = currentItem.dataName
        holder.problem.text = currentItem.dataProblem

    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val date : TextView = itemView.findViewById(R.id.date);
        val serviceID : TextView = itemView.findViewById(R.id.serviceID);
        val name: TextView = itemView.findViewById(R.id.name);
        val problem: TextView = itemView.findViewById(R.id.problem);


    }
}