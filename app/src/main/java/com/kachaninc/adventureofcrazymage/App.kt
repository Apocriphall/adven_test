package com.kachaninc.adventureofcrazymage

import android.app.Application
import com.kachaninc.adventureofcrazymage.di.appModule
import com.kachaninc.magicalstupidity.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(appModule, dataModule)
        }
    }
}