package com.example.animeapi.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.animeapi.presentation.ui.models.PixabayUI

class PixabayComparator : DiffUtil.ItemCallback<PixabayUI>() {
    override fun areItemsTheSame(oldItem: PixabayUI, newItem: PixabayUI): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: PixabayUI, newItem: PixabayUI): Boolean {
        return oldItem.id == newItem.id
    }
}