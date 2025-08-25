package com.example.feature.home

import com.example.core.User
import com.example.core.UserRepository

class UserRepositoryImpl: UserRepository {
    override fun getUsers(): List<User> {
        return listOf(
            User("User1"),
            User("User2"),
            User("User3"),
        )
    }
}