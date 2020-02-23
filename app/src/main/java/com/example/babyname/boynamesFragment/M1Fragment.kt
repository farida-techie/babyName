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


class M1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewM1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_m1,container,false)

        var M1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_M1 = rootViewM1.findViewById(R.id.listView_M1) as ListView

        listView_M1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,M1) }

        listView_M1.setSelectionAfterHeaderView()


        listView_M1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,M1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewM1
    }


}
