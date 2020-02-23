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


class R1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewR1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_r1,container,false)

        var R1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_R1 = rootViewR1.findViewById(R.id.listView_R1) as ListView

        listView_R1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,R1) }

        listView_R1.setSelectionAfterHeaderView()


        listView_R1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,R1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewR1
    }

}
