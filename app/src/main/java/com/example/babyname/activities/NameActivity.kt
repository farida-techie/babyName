package com.example.babyname.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.babyname.R
import kotlinx.android.synthetic.main.hame.*

class NameActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name);


        ivBoy.setOnClickListener {
            val intent = Intent(this, BoyActivity::class.java)
            startActivity(intent)
        }

        ivBath.setOnClickListener {
            val intent = Intent(this, BothActivity::class.java)
            startActivity(intent)
        }

        ivGirl.setOnClickListener {
            val intent = Intent(this, GirlActivity::class.java)
            startActivity(intent)
        }


    }
}