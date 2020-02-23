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


class W1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewW1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_w1,container,false)

        var W1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_W1 = rootViewW1.findViewById(R.id.listView_W1) as ListView

        listView_W1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,W1) }

        listView_W1.setSelectionAfterHeaderView()


        listView_W1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,W1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewW1
    }


}
