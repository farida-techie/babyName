package com.example.babyname

import android.app.TaskStackBuilder
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_name.*

class ToolBar : AppCompatActivity () {


    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }

}