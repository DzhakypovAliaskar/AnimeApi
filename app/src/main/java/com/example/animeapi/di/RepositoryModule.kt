package com.example.animeapi.di

import com.example.animeapi.domain.repositories.PixabayRepository
import com.example.animeapp.data.repository.PixabayRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindPixabayRepository(pixabayRepositoryImpl: PixabayRepositoryImpl): PixabayRepository
}