package com.example.animeapi.presentation.ui.models

import com.example.animeapi.domain.models.PixabayResponseModel


data class PixabayResponseUI(
    val hits: List<PixabayUI>
)

fun PixabayResponseModel.toUI() = PixabayResponseUI(
    hits.map { it.toUI() }
)