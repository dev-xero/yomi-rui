package dev.xero.yomirui.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val ColorPalette = lightColors(
	primary = Purple200,
	surface = Surface,
	background = Background,
	onSurface = OnSurface,
	secondary = Purple100
)

@Composable
fun YomiRuiTheme(content: @Composable () -> Unit) {
	val colors = ColorPalette

	MaterialTheme(
		colors = colors,
		typography = Typography,
		shapes = Shapes,
		content = content
	)
}