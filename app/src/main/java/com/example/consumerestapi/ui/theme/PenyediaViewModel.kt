package com.example.consumerestapi.ui.theme
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.consumerestapi.KontakAplication
import com.example.consumerestapi.ui.home.viewmodel.HomeViewModel
import com.example.consumerestapi.ui.kontak.viewmodel.InsertViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(aplikasiKontak().container.kontakRepository)
        }

        initializer {
            InsertViewModel(aplikasiKontak().container.kontakRepository)
        }
    }
}

fun CreationExtras.aplikasiKontak(): KontakAplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakAplication)