package com.example.myapplication.ui.recadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.core.view.LayoutInflaterCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class NotifAdapter(val context:Context, val list:ArrayList<notif>): RecyclerView.Adapter<NotifAdapter.MyVH>() {

    class MyVH(view: View): RecyclerView.ViewHolder(view){
        val image:ImageView = view.findViewById(R.id.imageNotif)
        val title:TextView = view.findViewById(R.id.titleNotif)
        val text:TextView = view.findViewById(R.id.textNotif)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotifAdapter.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.notif_adapter, parent, false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: NotifAdapter.MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.text.setText(list[position].text)
        holder.title.setText(list[position].title)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}