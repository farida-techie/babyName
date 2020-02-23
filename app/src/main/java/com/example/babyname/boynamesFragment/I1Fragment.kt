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


class I1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewI1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_i1,container,false)

        var I1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_I1 = rootViewI1.findViewById(R.id.listView_I1) as ListView

        listView_I1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,I1) }

        listView_I1.setSelectionAfterHeaderView()


        listView_I1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,I1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewI1
    }


}
