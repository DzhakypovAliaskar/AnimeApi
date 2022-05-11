package com.example.animeapi.presentation.ui.fragments

import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.animeapi.R
import com.example.animeapi.databinding.FragmentImageBinding
import com.example.animeapi.base.BaseFragment
import com.example.animeapi.presentation.ui.adapter.PixabayAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PixabayFragment :
    BaseFragment<FragmentImageBinding, PixabayViewModel>(R.layout.fragment_image) {
    override val binding: FragmentImageBinding by viewBinding(FragmentImageBinding::bind)
    override val viewModel: PixabayViewModel by viewModels()
    private val pixabayAdapter = PixabayAdapter()

    override fun initialize() {
        binding.imageRecycler.adapter = pixabayAdapter
    }

    override fun establishRequest() {
        viewModel.getImages("")
        searchQuery()
    }

    override fun launchObservers() {
        subscribeOnline()
    }

    private fun searchQuery() {
        binding.etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0 != null) {
                    viewModel.getImages(p0)
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
    }

    private fun subscribeOnline() {
        viewModel.searchQuery.spectateUiState(
            error = {
            },
            success = {
                pixabayAdapter.submitList(it.hits)
            })
    }
}