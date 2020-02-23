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


class K3Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewK3 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_k3,container,false)

        var K3 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_K3 = rootViewK3.findViewById(R.id.listView_K3) as ListView

        listView_K3!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,K3) }

        listView_K3.setSelectionAfterHeaderView()


        listView_K3.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,K3[position],Toast.LENGTH_SHORT).show()

        }

        return rootViewK3
    }

}
