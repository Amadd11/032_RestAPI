package com.example.consumerestapi.ui.theme.home.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.consumerestapi.navigation.DestinasiNavigasi
import com.example.consumerestapi.ui.theme.home.viewmodel.HomeViewModel
import com.example.consumerestapi.ui.theme.theme.PenyediaViewModel

object DestinasiHome : DestinasiNavigasi{
    override val route = "home"
    override val titleRes = "Kontak"
}

@Composable
fun HomeScreen(
    navigateToItemEntry: () -> Unit,
    modifier: Modifier = Modifier,
    onDetailClick: (Int) -> Unit = {},
    viewModel: HomeViewModel = viewModel(factory = PenyediaViewModel.Factory)
){

}
