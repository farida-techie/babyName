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


class C3Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewC3 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_c3,container,false)

        var C3 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_C3 = rootViewC3.findViewById(R.id.listView_C3) as ListView

        listView_C3!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,C3) }

        listView_C3.setSelectionAfterHeaderView()


        listView_C3.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,C3[position],Toast.LENGTH_SHORT).show()

        }

        return rootViewC3
    }
}
