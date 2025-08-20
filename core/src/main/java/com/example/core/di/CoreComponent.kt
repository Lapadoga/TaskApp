package com.example.core.di

import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Component(modules = [CoreModule::class])
@Singleton
interface CoreComponent {

    @DogRetrofit
    fun dogRetrofit(): Retrofit

    @IPRetrofit
    fun ipRetrofit(): Retrofit
}
