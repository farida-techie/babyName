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


class Z1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewZ1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_z1,container,false)

        var Z1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_Z1 = rootViewZ1.findViewById(R.id.listView_Z1) as ListView

        listView_Z1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,Z1) }

        listView_Z1.setSelectionAfterHeaderView()


        listView_Z1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,Z1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewZ1
    }


}
