package com.example.babyname.girlsFragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

import com.example.babyname.R


class M3Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewM3 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_m3,container,false)

        var M3 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_M3 = rootViewM3.findViewById(R.id.listView_M3) as ListView

        listView_M3!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,M3) }

        listView_M3.setSelectionAfterHeaderView()


        listView_M3.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,M3[position],Toast.LENGTH_SHORT).show()

        }

        return rootViewM3
    }

}
