package com.example.myapplication.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.ui.recadapter.DrashAdapter
import com.example.myapplication.ui.recadapter.MyDrash

class DashboardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root: View = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val drash_adapt : RecyclerView = root.findViewById(R.id.drash_recycler)
        drash_adapt.adapter = DrashAdapter(requireContext(), MyDrash().list)
        return root
    }
}