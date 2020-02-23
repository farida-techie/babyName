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


class O1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewO1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_o1,container,false)

        var O1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_O1 = rootViewO1.findViewById(R.id.listView_O1) as ListView

        listView_O1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,O1) }

        listView_O1.setSelectionAfterHeaderView()


        listView_O1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,O1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewO1
    }


}
