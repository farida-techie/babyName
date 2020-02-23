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


class X1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewX1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_x1,container,false)

        var X1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_X1 = rootViewX1.findViewById(R.id.listView_X1) as ListView

        listView_X1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,X1) }

        listView_X1.setSelectionAfterHeaderView()


        listView_X1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,X1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewX1
    }


}
