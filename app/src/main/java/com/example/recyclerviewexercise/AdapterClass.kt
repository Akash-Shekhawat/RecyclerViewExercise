package com.example.recyclerviewexercise

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(val datavalue: ArrayList<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolder>() {


        inner class ViewHolder (itemViews: View) : RecyclerView.ViewHolder(itemViews){

                val titleView: TextView = itemView.findViewById(R.id.titleView1)
                val addressView: TextView = itemView.findViewById(R.id.subtitleView1)
                val imageView: ImageView = itemView.findViewById(R.id.imageView1)
                val ratingBar: RatingBar = itemView.findViewById(R.id.ratingBar1)
                val noOfReviews: TextView = itemView.findViewById(R.id.numOfReviews)
                val dateTextView: TextView = itemView.findViewById(R.id.dateTextView)
                val amountTextView: TextView = itemView.findViewById(R.id.amountTextView)


        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
            return ViewHolder(view)
        }


        override fun getItemCount(): Int {
            return datavalue.size
        }


        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.titleView.text = datavalue[position].title
            holder.addressView.text = datavalue[position].address
            holder.imageView.setImageResource(datavalue[position].imageID)
            holder.ratingBar.numStars = datavalue[position].StarRatings
            holder.noOfReviews.text = datavalue[position].noOfReview
            holder.dateTextView.text = datavalue[position].date
            holder.amountTextView.text = datavalue[position].amount


        }
}