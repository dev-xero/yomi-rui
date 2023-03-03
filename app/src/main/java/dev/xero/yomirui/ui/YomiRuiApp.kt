package dev.xero.yomirui.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import dev.xero.yomirui.ui.screens.ErrorScreen
import dev.xero.yomirui.ui.screens.HomeScreen
import dev.xero.yomirui.ui.screens.LoadingScreen
import dev.xero.yomirui.ui.viewmodel.YomiViewModel

@Composable
fun YomiRuiApp(
	modifier: Modifier = Modifier
) {
	val viewModel: YomiViewModel = viewModel(factory = YomiViewModel.Factory)

	HomeScreen(modifier = modifier)
}