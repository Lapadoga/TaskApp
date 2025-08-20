package com.example.feature.home.di

import com.example.core.di.CoreComponent
import dagger.Component

@Component(dependencies = [CoreComponent::class])
interface HomeComponent {

    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): HomeComponent
    }
}