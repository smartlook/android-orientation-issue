package com.smartlook.orientationissue.landscape

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.smartlook.orientationissue.R

class ReverseLandscapeActivity: AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orientation)

        findViewById<TextView>(R.id.tvOrientation).text = "Activity in REVERSE LANDSCAPE orientation"
    }
}