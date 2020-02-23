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
import kotlinx.android.synthetic.main.fragment_f1.*


class F1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootViewF1 = LayoutInflater.from(container?.context).inflate(R.layout.fragment_f1,container,false)

        var F1 = arrayOf("ahaa","ahge","ahgra","fahfld","adfrk","sjdks","adfhgop","ashkk","ajdhgrf","adhgr","asdhfj","asfrk","skflr","adroe","akdie","adrhfu","adeu")

        val listView_F1 = rootViewF1.findViewById(R.id.listView_F1) as ListView

        listView_F1!!.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1,F1) }

        listView_F1.setSelectionAfterHeaderView()


        listView_F1.setOnItemClickListener {
                adapterView,
                view,
                position,
                id
            ->  Toast.makeText(activity,F1[position], Toast.LENGTH_SHORT).show()

        }

        return rootViewF1
    }


}
