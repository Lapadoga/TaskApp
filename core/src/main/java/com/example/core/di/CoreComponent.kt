package com.example.core.di

import com.example.core.LogProvider
import dagger.Component

@Component(modules = [CoreModule::class])
interface CoreComponent {
    fun provideLogProvider(): LogProvider
}
