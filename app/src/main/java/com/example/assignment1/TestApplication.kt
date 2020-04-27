package com.example.assignment1

import android.app.Application
import com.example.assignment1.koin.modules.networkModule
import com.example.assignment1.koin.modules.usecaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class TestApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@TestApplication)
            modules(mutableListOf(networkModule, usecaseModule))
        }
    }
}