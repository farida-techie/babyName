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
import kotlinx.android.synthetic.main.activity_boy.*


class A1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootViewA1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_a1,container,false)

        var A1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_A1 = rootViewA1.findViewById(R.id.listView_A1) as ListView

       listView_A1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,A1) }

        listView_A1.setSelectionAfterHeaderView()


        listView_A1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,A1[position],Toast.LENGTH_SHORT).show()

        }

        return rootViewA1
    }


}
