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


class V1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewV1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_v1,container,false)

        var V1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_V1 = rootViewV1.findViewById(R.id.listView_V1) as ListView

        listView_V1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,V1) }

        listView_V1.setSelectionAfterHeaderView()


        listView_V1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,V1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewV1
    }


}
