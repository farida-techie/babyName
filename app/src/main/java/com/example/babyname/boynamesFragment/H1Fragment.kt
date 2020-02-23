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


class H1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewH1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_h1,container,false)

        var H1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_H1 = rootViewH1.findViewById(R.id.listView_H1) as ListView

        listView_H1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,H1) }

        listView_H1.setSelectionAfterHeaderView()


        listView_H1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,H1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewH1
    }


}
