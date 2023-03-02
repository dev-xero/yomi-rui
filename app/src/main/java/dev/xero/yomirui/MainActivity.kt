package dev.xero.yomirui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import dev.xero.yomirui.ui.YomiRuiApp
import dev.xero.yomirui.ui.theme.YomiRuiTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		installSplashScreen()
		super.onCreate(savedInstanceState)

		setContent {
			YomiRuiTheme {
				YomiRuiApp()
			}
		}
	}
}
