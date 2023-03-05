package com.example.myapplication.ui.home

import com.example.myapplication.ui.recadapter.MyVertical
import com.example.myapplication.ui.recadapter.VerAdapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView.RecyclerListener
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.ui.recadapter.HorAdapter
import com.example.myapplication.ui.recadapter.MyHorizont

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root: View = inflater.inflate(R.layout.fragment_home, container, false)
        val vert : RecyclerView = root.findViewById(R.id.ver_recycler)
        vert.adapter = VerAdapter(requireContext(),MyVertical().listVer)
        val hor : RecyclerView = root.findViewById(R.id.hor_recycler)
        hor.adapter = HorAdapter(requireContext(),MyHorizont().list)
        return root
    }
}