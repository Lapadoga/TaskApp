package com.example.core.network.api

import com.example.core.network.dto.IPDto
import retrofit2.http.GET
import retrofit2.http.Query

interface IPApi {
    @GET
    suspend fun getCurrentIP(@Query("format") format: String = "json"): IPDto
}