package com.example.a30daysofproductivity.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daysofproductivity.R
import com.example.a30daysofproductivity.data.Artip
import com.google.android.material.card.MaterialCardView

class ArtTipAdapter(private val artTips: List<Artip>) :
    RecyclerView.Adapter<ArtTipAdapter.ArtTipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtTipViewHolder{
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_art_tip, parent, false)
        return ArtTipViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtTipViewHolder, position: Int) {
        val artTip = artTips[position]
        holder.daynumber.text = "Day ${artTip.day}"
        holder.artTitle.text = artTip.title
        holder.artDescription.text = artTip.description
        holder.artImage.setImageResource(artTip.imageResId)
    }

    override fun getItemCount(): Int = artTips.size

    class ArtTipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val daynumber: TextView = itemView.findViewById(R.id.day_number)
        val artTitle: TextView = itemView.findViewById(R.id.art_title)
        val artDescription: TextView = itemView.findViewById(R.id.art_description)
        val artImage: ImageView = itemView.findViewById(R.id.art_image)
    }
}