package dev.xero.yomirui.ui.viewmodel

import androidx.lifecycle.ViewModel

class YomiViewModel : ViewModel() {
	sealed interface AppDataState {
		object Loading: AppDataState

		object Failure: AppDataState
	}

}