package com.example.myapplication.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentNotificationsBinding
import com.example.myapplication.ui.recadapter.HorAdapter
import com.example.myapplication.ui.recadapter.MyNotif
import com.example.myapplication.ui.recadapter.NotifAdapter

class NotificationsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root: View = inflater.inflate(R.layout.fragment_notifications, container, false)
        val notifications : RecyclerView = root.findViewById(R.id.notifRecyclerView)
        notifications.adapter = NotifAdapter(requireContext(),MyNotif().list)
        return root
    }
}