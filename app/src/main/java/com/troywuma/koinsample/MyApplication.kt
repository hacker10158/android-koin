package com.troywuma.koinsample

import android.app.Application
import com.troywuma.koinsample.di.creatureModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this,listOf(creatureModule))

    }
}
