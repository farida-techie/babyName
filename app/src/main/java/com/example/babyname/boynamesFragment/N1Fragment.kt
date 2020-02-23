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


class N1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewN1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_n1,container,false)

        var N1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_N1 = rootViewN1.findViewById(R.id.listView_N1) as ListView

        listView_N1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,N1) }

        listView_N1.setSelectionAfterHeaderView()


        listView_N1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,N1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewN1
    }


}
