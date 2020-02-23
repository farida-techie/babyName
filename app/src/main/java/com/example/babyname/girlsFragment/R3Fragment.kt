package com.example.babyname.girlsFragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

import com.example.babyname.R


class R3Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewR3 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_r3,container,false)

        var R3 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_R3 = rootViewR3.findViewById(R.id.listView_R3) as ListView

        listView_R3!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,R3) }

        listView_R3.setSelectionAfterHeaderView()


        listView_R3.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,R3[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewR3
    }

}
