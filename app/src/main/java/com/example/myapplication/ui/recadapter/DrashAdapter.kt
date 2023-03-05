package com.example.myapplication.ui.recadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class DrashAdapter(val context:Context, val list:ArrayList<drash>): RecyclerView.Adapter<DrashAdapter.MyVH>() {

    class MyVH(viewItem: View) : RecyclerView.ViewHolder(viewItem){
        val Title:TextView =  viewItem.findViewById(R.id.drashTitle)
        val Text:TextView = viewItem.findViewById(R.id.drashText)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrashAdapter.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.drash_adapter, parent, false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: DrashAdapter.MyVH, position: Int) {
        holder.Text.setText(list[position].text)
        holder.Title.setText(list[position].title)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}