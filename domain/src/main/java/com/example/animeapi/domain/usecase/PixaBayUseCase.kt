package com.example.animeapi.domain.usecase

import com.example.animeapi.domain.repositories.PixabayRepository
import javax.inject.Inject

class PixaBayUseCase @Inject constructor(
    private val pixabayRepository: PixabayRepository
) {
    operator fun invoke(name: CharSequence) = pixabayRepository.fetchImages(name)

}