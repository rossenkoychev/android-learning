package com.example.rossen.androidadvancedlearning.ui

import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.rossen.androidadvancedlearning.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bodyPartFragment=BodyPartFragment()
        val fragmentManager=getSupportFragmentManager()

        fragmentManager.beginTransaction()
                .add(R.id.head_container,bodyPartFragment)
                .commit()
    }
}
