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


class K1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewK1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_k1,container,false)

        var K1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_K1 = rootViewK1.findViewById(R.id.listView_K1) as ListView

        listView_K1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,K1) }

        listView_K1.setSelectionAfterHeaderView()


        listView_K1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,K1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewK1
    }

}
