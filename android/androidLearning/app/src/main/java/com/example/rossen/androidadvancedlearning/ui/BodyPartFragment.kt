package com.example.rossen.androidadvancedlearning.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.rossen.androidadvancedlearning.R
import com.example.rossen.androidadvancedlearning.data.AndroidImageAssets
import kotlinx.android.synthetic.main.fragment_body_part.view.*

class BodyPartFragment() : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_body_part, container, false)
        val imageView = rootView.findViewById(R.id.body_part_imageView) as ImageView
        val a = AndroidImageAssets.heads.get(0)
        imageView.setImageResource(AndroidImageAssets.heads.get(0))

        return rootView
    }
}