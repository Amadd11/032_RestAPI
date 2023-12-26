package com.example.consumerestapi.ui.kontak.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.consumerestapi.repository.KontakRepository

class InsertViewModel(private val kontakRepository: KontakRepository) : ViewModel(){

    data class InsertUiState(
        val insertUiEvent: InsertUiEvent = InsertUiEvenet(),
    )
}