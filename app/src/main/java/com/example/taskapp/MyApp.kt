package com.example.taskapp

import android.app.Application
import com.example.core.CoreComponentProvider
import com.example.core.di.DaggerCoreComponent

class MyApp : Application(), CoreComponentProvider {
    private val coreComponent = DaggerCoreComponent.create()

    override fun getCoreComponent() = coreComponent
}