package dev.xero.yomirui.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.xero.yomirui.ui.screens.ErrorScreen
import dev.xero.yomirui.ui.screens.HomeScreen
import dev.xero.yomirui.ui.screens.LoadingScreen

@Composable
fun YomiRuiApp(
	modifier: Modifier = Modifier
) {
	HomeScreen(modifier = modifier)
}