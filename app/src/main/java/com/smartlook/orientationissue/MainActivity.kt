package com.smartlook.orientationissue

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.smartlook.orientationissue.landscape.LandscapeActivity
import com.smartlook.orientationissue.landscape.ReverseLandscapeActivity
import com.smartlook.orientationissue.portrait.PortraitActivity
import com.smartlook.orientationissue.portrait.ReversePortraitActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Force orientation change on MainActivity.
         */

        /**
         * Force PORTRAIT orientation programmatically.
         */
        findViewById<Button>(R.id.bForcePortrait).setOnClickListener {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        }

        /**
         * Force REVERSE PORTRAIT orientation programmatically.
         */
        findViewById<Button>(R.id.bForceReversePortrait).setOnClickListener {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT
        }

        /**
         * Force LANDSCAPE orientation programmatically.
         */
        findViewById<Button>(R.id.bForceLandscape).setOnClickListener {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        }

        /**
         * Force REVERSE LANDSCAPE orientation programmatically.
         */
        findViewById<Button>(R.id.bForceReverseLandscape).setOnClickListener {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE
        }

        /**
         * Open Activity with force orientation.
         */


        /**
         * Open activity with PORTRAIT orientation set in manifest.
         */
        findViewById<Button>(R.id.bPortraitActivity).setOnClickListener {
            startActivity(Intent(this, PortraitActivity::class.java))
        }

        /**
         * Open activity with REVERSE PORTRAIT orientation set in manifest.
         */
        findViewById<Button>(R.id.bReversePortraitActivity).setOnClickListener {
            startActivity(Intent(this, ReversePortraitActivity::class.java))
        }

        /**
         * Open activity with LANDSCAPE orientation set in manifest.
         */
        findViewById<Button>(R.id.bLandscapeActivity).setOnClickListener {
            startActivity(Intent(this, LandscapeActivity::class.java))
        }

        /**
         * Open activity with REVERSE LANDSCAPE orientation set in manifest.
         */
        findViewById<Button>(R.id.bReverseLandscapeActivity).setOnClickListener {
            startActivity(Intent(this, ReverseLandscapeActivity::class.java))
        }
    }
}