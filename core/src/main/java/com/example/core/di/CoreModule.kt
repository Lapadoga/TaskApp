package com.example.core.di

import com.example.core.LogProvider
import com.example.core.LogProviderImpl
import dagger.Binds
import dagger.Module

@Module
interface CoreModule {
    @Binds
    fun bindLogProvider(logProviderImpl: LogProviderImpl): LogProvider
}