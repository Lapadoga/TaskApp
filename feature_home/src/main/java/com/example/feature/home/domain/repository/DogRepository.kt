package com.example.feature.home.domain.repository

import com.example.feature.home.domain.entity.Dog

interface DogRepository {
    suspend fun getRandomDog(): Dog
}