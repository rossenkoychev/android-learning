package com.example.rossen.androidadvancedlearning.mvvm

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData


class MVVMMainViewModel(val context: Application) : AndroidViewModel(context){
    val name : MutableLiveData<String> = MutableLiveData()
}