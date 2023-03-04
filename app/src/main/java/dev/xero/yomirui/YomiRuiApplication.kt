package dev.xero.yomirui

import android.app.Application
import dev.xero.yomirui.di.AppContainer
import dev.xero.yomirui.di.AppContainerInterface

class YomiRuiApplication : Application() {
	lateinit var container: AppContainerInterface
	override fun onCreate() {
		super.onCreate()
		container = AppContainer()
	}
}