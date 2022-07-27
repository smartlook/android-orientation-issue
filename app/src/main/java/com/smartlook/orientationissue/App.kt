package com.smartlook.orientationissue

import android.app.Application
import com.smartlook.android.core.api.Smartlook

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        val smartlook = Smartlook.instance
        smartlook.preferences.projectKey = "YOUR API KEY"
        smartlook.start()
    }

}