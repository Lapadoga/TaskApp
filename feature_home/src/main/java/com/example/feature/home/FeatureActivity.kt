package com.example.feature.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.core.CoreComponentProvider
import com.example.feature.home.di.DaggerHomeComponent

class FeatureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val component = DaggerHomeComponent.factory().create(
            (applicationContext as CoreComponentProvider).getCoreComponent()
        )
        val logger = component.provideLogger()

        val users = UserRepositoryImpl().getUsers()
        for (user in users) {
            logger.log(user.name)
        }
    }
}