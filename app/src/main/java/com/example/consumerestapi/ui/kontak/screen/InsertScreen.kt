package com.example.consumerestapi.ui.kontak.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.consumerestapi.ui.kontak.viewmodel.InsertViewModel
import com.example.consumerestapi.ui.theme.PenyediaViewModel

@Composable
fun EntryKontakScreen(
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: InsertViewModel = viewModel(factory = PenyediaViewModel.Factory),
){

}