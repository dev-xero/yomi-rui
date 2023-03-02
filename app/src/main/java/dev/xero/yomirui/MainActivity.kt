package dev.xero.yomirui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import dev.xero.yomirui.ui.YomiRuiApp
import dev.xero.yomirui.ui.theme.YomiRuiTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		val splashScreen = installSplashScreen()
		super.onCreate(savedInstanceState)

		setContent {
			YomiRuiTheme {
				YomiRuiApp()
			}
		}
	}
}
