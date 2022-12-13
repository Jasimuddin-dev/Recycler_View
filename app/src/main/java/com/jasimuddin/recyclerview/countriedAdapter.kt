package com.jasimuddin.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class countriesAdapter(
    var countryNameList: ArrayList<String>,
    var detailsList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context: Context):RecyclerView.Adapter<countriesAdapter.countryListHolder>() {

    class countryListHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        var textViewCountryName:TextView = itemView.findViewById(R.id.textViewCountryName)
        var textViewDetails:TextView = itemView.findViewById(R.id.textViewDetails)
        var imageview :CircleImageView = itemView.findViewById(R.id.imageView)
        var cardView:CardView = itemView.findViewById(R.id.cardView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): countryListHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.card_view,parent,false)
        return countryListHolder(view)
    }

    override fun onBindViewHolder(holder: countryListHolder, position: Int) {
        holder.textViewCountryName.text = countryNameList.get(position)
        holder.textViewDetails.text = detailsList.get(position)
        holder.imageview.setImageResource(imageList.get(position))

        holder.cardView.setOnClickListener {

            Toast.makeText(context,
                "This is the flag of ${countryNameList.get(position)}",
                Toast.LENGTH_LONG).show()

        }
    }

    override fun getItemCount(): Int {
        return countryNameList.size
    }

}