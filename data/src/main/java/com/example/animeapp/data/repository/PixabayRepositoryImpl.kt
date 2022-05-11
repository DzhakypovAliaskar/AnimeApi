package com.example.animeapp.data.repository

import com.example.animeapi.domain.repositories.PixabayRepository
import com.example.animeapp.data.remote.PixabayApi
import com.example.animeapp.data.remote.toDomain
import com.example.animeapp.data.repository.base.BaseRepository
import javax.inject.Inject

class PixabayRepositoryImpl @Inject constructor(
    private val pixabayApi: PixabayApi
) : BaseRepository(), PixabayRepository {

    override fun fetchImages(name: CharSequence) = sendRequest {
        pixabayApi.fetchImages(name).toDomain()
    }
}