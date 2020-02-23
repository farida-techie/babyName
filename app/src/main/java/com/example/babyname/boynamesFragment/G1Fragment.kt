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


class G1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewG1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_g1,container,false)

        var G1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_G1 = rootViewG1.findViewById(R.id.listView_F1) as ListView

        listView_G1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,G1) }

        listView_G1.setSelectionAfterHeaderView()


        listView_G1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,G1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewG1
    }

}
