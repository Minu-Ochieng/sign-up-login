package com.akirachix.mentorgram

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nxtPage = findViewById<TextView>(R.id.nxtPage)

        nxtPage.setOnClickListener{
            val intent =Intent(this, login::class.java)
            startActivity(intent)
        }

    }
}