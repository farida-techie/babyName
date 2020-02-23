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


class T1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewT1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_t1,container,false)

        var T1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_T1 = rootViewT1.findViewById(R.id.listView_T1) as ListView

        listView_T1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,T1) }

        listView_T1.setSelectionAfterHeaderView()


        listView_T1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,T1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewT1
    }


}
