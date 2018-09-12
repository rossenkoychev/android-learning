package com.example.rossen.androidadvancedlearning.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import com.example.rossen.androidadvancedlearning.R
import com.example.rossen.androidadvancedlearning.data.AndroidImageAssets

class MasterListFragment : Fragment() {

    lateinit var onImageClickListener:OnImageClickListener

    interface OnImageClickListener {
        fun onImageSelected(position:Int)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_master_list, container, false)

        val adapter=MasterListAdapter(context!!,AndroidImageAssets.all)
        val gridView: GridView = rootView.findViewById(R.id.master_grid_view)
        gridView.adapter=adapter
        return rootView
    }
}