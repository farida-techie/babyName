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


class U1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewU1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_u1,container,false)

        var U1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_U1 = rootViewU1.findViewById(R.id.listView_U1) as ListView

        listView_U1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,U1) }

        listView_U1.setSelectionAfterHeaderView()


        listView_U1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,U1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewU1
    }


}
