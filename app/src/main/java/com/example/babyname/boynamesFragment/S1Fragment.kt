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


class S1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewS1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_s1,container,false)

        var S1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_S1 = rootViewS1.findViewById(R.id.listView_S1) as ListView

        listView_S1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,S1) }

        listView_S1.setSelectionAfterHeaderView()


        listView_S1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,S1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewS1
    }


}
