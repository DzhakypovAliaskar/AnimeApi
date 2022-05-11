package com.example.animeapi.domain.repositories

import com.example.animeapi.domain.either.Either
import com.example.animeapi.domain.models.PixabayResponseModel
import kotlinx.coroutines.flow.Flow

interface PixabayRepository {
    fun fetchImages(name: CharSequence): Flow<Either<String, PixabayResponseModel>>

}