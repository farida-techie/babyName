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


class C1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewC1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_c1,container,false)

        var C1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_C1 = rootViewC1.findViewById(R.id.listView_C1) as ListView

        listView_C1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,C1) }

        listView_C1.setSelectionAfterHeaderView()


        listView_C1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,C1[position],Toast.LENGTH_SHORT).show()

        }

        return rootViewC1
    }


}
