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


class Y1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewY1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_y1,container,false)

        var Y1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_Y1 = rootViewY1.findViewById(R.id.listView_Y1) as ListView

        listView_Y1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,Y1) }

        listView_Y1.setSelectionAfterHeaderView()


        listView_Y1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,Y1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewY1
    }


}
