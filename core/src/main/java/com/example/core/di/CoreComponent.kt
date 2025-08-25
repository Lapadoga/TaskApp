package com.example.core.di

import com.example.core.LogProvider
import dagger.Component

@Component(modules = [LoggerModule::class])
interface CoreComponent {
    fun provideLogProvider(): LogProvider
}
