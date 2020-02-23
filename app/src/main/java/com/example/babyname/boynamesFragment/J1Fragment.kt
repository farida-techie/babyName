package com.example.babyname.boynamesFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.babyname.R


class J1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewJ1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_j1,container,false)

        var J1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_J1 = rootViewJ1.findViewById(R.id.listView_J1) as ListView

        listView_J1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,J1) }

        listView_J1.setSelectionAfterHeaderView()


        listView_J1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,J1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewJ1
    }

}
