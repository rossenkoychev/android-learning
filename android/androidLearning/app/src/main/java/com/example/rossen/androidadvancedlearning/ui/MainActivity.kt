package com.example.rossen.androidadvancedlearning.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.example.rossen.androidadvancedlearning.R

class MainActivity : AppCompatActivity(), MasterListFragment.OnImageClickListener {

    var headIndex: Int = 0
    var bodyIndex: Int = 0
    var legIndex: Int = 0
    lateinit var androidMeIntent:Intent
    lateinit var buttonNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonNext = findViewById(R.id.next_button)
        val bundle = Bundle()
        bundle.putInt(AndroidMeActivity.BODY_INDEX, 0)
        bundle.putInt(AndroidMeActivity.HEAD_INDEX, 0)
        bundle.putInt(AndroidMeActivity.LEG_INDEX, 0)
        androidMeIntent = Intent(this, AndroidMeActivity::class.java)
        androidMeIntent.putExtras(bundle)
        buttonNext.setOnClickListener { startActivity(androidMeIntent) }
    }

    override fun onImageSelected(position: Int) {
        Toast.makeText(this, "Position clicked ${position + 1}", Toast.LENGTH_LONG).show()
        val bodyPartNumber = position / 12
        val listIndex = position - 12 * bodyPartNumber

        when (bodyPartNumber) {
            0 -> headIndex = listIndex
            1 -> bodyIndex = listIndex
            2 -> legIndex = listIndex
        }

        val bundle = Bundle()
        bundle.putInt(AndroidMeActivity.BODY_INDEX, bodyIndex)
        bundle.putInt(AndroidMeActivity.HEAD_INDEX, headIndex)
        bundle.putInt(AndroidMeActivity.LEG_INDEX, legIndex)

        androidMeIntent.putExtras(bundle)

    }
}