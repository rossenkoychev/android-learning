package com.example.rossen.androidadvancedlearning.mainpackage

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.content.FileProvider
import android.widget.Button
import com.example.rossen.androidadvancedlearning.R
import com.example.rossen.androidadvancedlearning.fragments.ui.MainFragmentsActivity
import com.example.rossen.androidadvancedlearning.libraries.BitmapUtils
import com.example.rossen.androidadvancedlearning.libraries.EmojifyMeActivity
import java.io.File
import java.io.IOException

class MainActivity:Activity() {
    private val REQUEST_IMAGE_CAPTURE = 1
    private val FILE_PROVIDER_AUTHORITY = "com.example.android.fileprovider"
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


//        // Create the capture image intent
//        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//
//        // Ensure that there's a camera activity to handle the intent
//        if (takePictureIntent.resolveActivity(packageManager) != null) {
//            // Create the temporary File where the photo should go
//            val photoFile: File
//            try {
//                photoFile = BitmapUtils.createTempImageFile(this)
//                // Get the path of the temporary file
//               val mTempPhotoPath = photoFile.absolutePath
//
//                // Get the content URI for the image file
//                val photoURI = FileProvider.getUriForFile(this,
//                        FILE_PROVIDER_AUTHORITY,
//                        photoFile)
//
//                // Add the URI so the camera can store the image
//                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
//
//                // Launch the camera activity
//                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
//            } catch (ex: IOException) {
//                // Error occurred while creating the File
//                ex.printStackTrace()
//                return
//            }
//        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}