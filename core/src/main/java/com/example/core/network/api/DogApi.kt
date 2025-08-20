package com.example.core.network.api

import com.example.core.network.dto.DogDto
import retrofit2.http.GET

interface DogApi {
    @GET("api/breeds/image/random")
    suspend fun getRandomDog(): DogDto
}