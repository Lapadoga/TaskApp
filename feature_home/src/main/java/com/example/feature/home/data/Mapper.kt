package com.example.feature.home.data

import com.example.core.network.dto.DogDto
import com.example.core.network.dto.IPDto
import com.example.feature.home.domain.entity.Dog
import com.example.feature.home.domain.entity.IP

fun DogDto.toEntity() = Dog(
    message = message
)

fun IPDto.toEntity() = IP(
    ip = ip
)