package com.wasfan.fixfastbuddy2.Garage.AdapterClasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wasfan.fixfastbuddy2.Garage.DataClasses.HomePageDataClass
import com.wasfan.fixfastbuddy2.R

class HomePagerAdapter( private val dataList : ArrayList<HomePageDataClass>
) : RecyclerView.Adapter<HomePagerAdapter.CardViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.garage_home_card_container, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.image.setImageResource(currentItem.dataImage)
        holder.name.text = currentItem.dataName
        holder.starImage.setImageResource(currentItem.dataStar)
        holder.rating.text = currentItem.dataRating
        holder.location.text = currentItem.dataLocation
        holder.problem.text = currentItem.dataProblem
        holder.status.text = currentItem.dataStatus
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.homeCardMechanicProfile);
        val name: TextView = itemView.findViewById(R.id.homeCardName);
        val rating: TextView = itemView.findViewById(R.id.homeCardRating);
        val starImage: ImageView = itemView.findViewById(R.id.homeCardratingstar);
        val location: TextView = itemView.findViewById(R.id.homeCardLocation);
        val problem: TextView = itemView.findViewById(R.id.homeCardProblem);
        val status: TextView = itemView.findViewById(R.id.homeCardstatus);
    }
}
