package com.example.myapplication.ui.recadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class HorAdapter(val context: Context, val list: ArrayList<horizont>): RecyclerView.Adapter<HorAdapter.MyVH>() {

    class MyVH(itemView: View): RecyclerView.ViewHolder(itemView){
        val image:ImageView = itemView.findViewById(R.id.imageHor)
        val text:TextView = itemView.findViewById(R.id.textHor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorAdapter.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.hor_adapter, parent, false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: HorAdapter.MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.text.setText(list[position].title)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}