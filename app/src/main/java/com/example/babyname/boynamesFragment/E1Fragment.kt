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


class E1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewE1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_e1,container,false)

        var E1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_E1 = rootViewE1.findViewById(R.id.listView_E1) as ListView

        listView_E1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,E1) }

        listView_E1.setSelectionAfterHeaderView()


        listView_E1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,E1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewE1
    }


}
