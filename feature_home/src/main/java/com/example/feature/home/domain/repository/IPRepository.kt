package com.example.feature.home.domain.repository

import com.example.feature.home.domain.entity.IP

interface IPRepository {
    suspend fun getCurrentIP(): IP
}