package com.example.feature.home.data

import com.example.core.di.DogRetrofit
import com.example.core.di.IPRetrofit
import com.example.core.network.api.DogApi
import com.example.core.network.api.IPApi
import com.example.feature.home.domain.entity.Dog
import com.example.feature.home.domain.entity.IP
import com.example.feature.home.domain.repository.DogRepository
import com.example.feature.home.domain.repository.IPRepository
import retrofit2.Retrofit
import javax.inject.Inject

class RetrofitRepository @Inject constructor(
    @DogRetrofit dogRetrofit: Retrofit,
    @IPRetrofit ipRetrofit: Retrofit
) : DogRepository, IPRepository {

    private val dogService = dogRetrofit.create(DogApi::class.java)
    private val ipService = ipRetrofit.create(IPApi::class.java)

    override suspend fun getRandomDog(): Dog {
        return dogService.getRandomDog().toEntity()
    }

    override suspend fun getCurrentIP(): IP {
        return ipService.getCurrentIP().toEntity()
    }
}