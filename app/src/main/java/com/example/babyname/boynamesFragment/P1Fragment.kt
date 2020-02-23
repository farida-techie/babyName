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


class P1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewP1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_p1,container,false)

        var P1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_P1 = rootViewP1.findViewById(R.id.listView_P1) as ListView

        listView_P1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,P1) }

        listView_P1.setSelectionAfterHeaderView()


        listView_P1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,P1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewP1
    }


}
