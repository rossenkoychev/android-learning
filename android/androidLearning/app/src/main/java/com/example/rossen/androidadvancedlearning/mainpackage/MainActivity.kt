package com.example.rossen.androidadvancedlearning.mainpackage

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.rossen.androidadvancedlearning.R
import com.example.rossen.androidadvancedlearning.fragments.ui.MainFragmentsActivity
import com.example.rossen.androidadvancedlearning.libraries.EmojifyMeActivity

class MainActivity:Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val fragmentsButton=findViewById<Button>(R.id.fragments_button)
        fragmentsButton.setOnClickListener {
            val fragmentsIntent= Intent(this,MainFragmentsActivity::class.java)
            startActivity(fragmentsIntent)
        }

        val librariesButton=findViewById<Button>(R.id.libraries_button)
        librariesButton.setOnClickListener {
            val librariesIntent=Intent(this,EmojifyMeActivity::class.java)
            startActivity(librariesIntent)
        }
    }
}