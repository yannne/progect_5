package com.example.myapplication.ui.recadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class VerAdapter(val context: Context, val list: List<vertical>) : RecyclerView.Adapter<VerAdapter.MyVH>() {

    class MyVH(ItemView:View) : RecyclerView.ViewHolder(ItemView){
        val image:ImageView = itemView.findViewById(R.id.imageVer)
        val title:TextView = itemView.findViewById(R.id.titleVer)
        val text:TextView = itemView.findViewById(R.id.textVer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerAdapter.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.ver_adapter, parent, false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: VerAdapter.MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.text.setText(list[position].text)
        holder.title.setText(list[position].title)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}