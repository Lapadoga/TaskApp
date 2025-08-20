package com.example.core.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
class CoreModule {

    @Provides
    @Singleton
    @DogRetrofit
    fun provideDogRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("dog.ceo/")
            .build()
    }

    @Provides
    @Singleton
    @IPRetrofit
    fun provideIPRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("api.ipify.org/")
            .build()
    }
}

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class DogRetrofit

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class IPRetrofit