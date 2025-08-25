package com.example.core

interface UserRepository {
    fun getUsers(): List<User>
}