package com.example.core

import com.example.core.di.CoreComponent

interface CoreComponentProvider {
    fun getCoreComponent(): CoreComponent
}