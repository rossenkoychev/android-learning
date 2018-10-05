package com.example.rossen.androidadvancedlearning.mvvm

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import com.example.rossen.androidadvancedlearning.R
import com.example.rossen.androidadvancedlearning.utils.KeyboardUtils
import kotlinx.android.synthetic.main.mvp_main_activity_layout.*


class MVVMMainActivity : AppCompatActivity() {

    lateinit var viewModel: MVVMMainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mvvm_main_activity_layout)
viewModel=obtainV


        addUserButton.setOnClickListener {
            KeyboardUtils.hideKeyboard(it, this)
        }

        playerEditText.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) KeyboardUtils.hideKeyboard(view, this)
        }
    }

    fun obtainViewModel(activity: FragmentActivity): MVVMMainViewModel {
        // Use a Factory to inject dependencies into the ViewModel
        val factory = ViewModelFactory.getInstance(activity.application)

        return ViewModelProviders.of(activity, factory).get(TasksViewModel::class.java!!)
    }

}