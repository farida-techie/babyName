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


class Q1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewQ1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_q1,container,false)

        var Q1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_Q1 = rootViewQ1.findViewById(R.id.listView_Q1) as ListView

        listView_Q1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,Q1) }

        listView_Q1.setSelectionAfterHeaderView()


        listView_Q1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,Q1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewQ1
    }


}
