package com.smartlook.orientationissue

import android.app.Application
import com.smartlook.android.core.api.Smartlook
import com.smartlook.android.util.logging.annotation.LogAspect

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        with(Smartlook.instance) {
            preferences.projectKey = "YOUR API KEY"
            log.allowedLogAspects = LogAspect.ORIENTATION_CHANGES
            start()
        }
    }

}