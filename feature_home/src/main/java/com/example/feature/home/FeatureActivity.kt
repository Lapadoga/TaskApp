package com.example.feature.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.core.di.DaggerCoreComponent
import com.example.feature.home.di.DaggerHomeComponent

class FeatureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val component = DaggerHomeComponent.factory().create(
            DaggerCoreComponent.builder().build()
        )

        val users = UserRepositoryImpl().getUsers()
        val logger = component.provideLogger()

        for (user in users) {
            logger.log(user.name)
        }
    }
}