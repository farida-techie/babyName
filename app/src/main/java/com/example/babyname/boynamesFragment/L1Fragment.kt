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


class L1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewL1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_l1,container,false)

        var L1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_L1 = rootViewL1.findViewById(R.id.listView_L1) as ListView

        listView_L1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,L1) }

        listView_L1.setSelectionAfterHeaderView()


        listView_L1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,L1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewL1
    }


}
