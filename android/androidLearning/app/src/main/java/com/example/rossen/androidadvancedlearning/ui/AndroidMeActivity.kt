package com.example.rossen.androidadvancedlearning.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.rossen.androidadvancedlearning.R
import com.example.rossen.androidadvancedlearning.data.AndroidImageAssets

class AndroidMeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_me)

        if (savedInstanceState == null) {
            val fragmentManager = getSupportFragmentManager()

            val headFragment = BodyPartFragment()
            headFragment.imageIds = AndroidImageAssets.heads
            headFragment.listIndex = 1
            val bodyFragment = BodyPartFragment()
            bodyFragment.imageIds = AndroidImageAssets.bodies
            bodyFragment.listIndex = 1
            val legsFragment = BodyPartFragment()
            legsFragment.imageIds = AndroidImageAssets.legs
            legsFragment.listIndex = 1
            fragmentManager.beginTransaction()
                    .add(R.id.head_container, headFragment)
                    .add(R.id.body_container, bodyFragment)
                    .add(R.id.legs_container, legsFragment)
                    .commit()

        }
    }
}
