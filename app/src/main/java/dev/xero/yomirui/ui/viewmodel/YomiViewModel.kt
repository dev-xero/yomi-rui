package dev.xero.yomirui.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import dev.xero.yomirui.YomiRuiApplication
import dev.xero.yomirui.repository.YomiRuiRepositoryInterface
import kotlinx.coroutines.launch
import java.io.IOException

class YomiViewModel(
	private val repository: YomiRuiRepositoryInterface
) : ViewModel() {

	private val tag = "APP"

	init {
		viewModelScope.launch {
			try {
				Log.d(tag, repository.getTopManga().toString())
			} catch (e: IOException) {
				Log.d(tag, "FAIL")
			}
		}
	}

	// Factory for the viewModel
	companion object {
		val Factory: ViewModelProvider.Factory = viewModelFactory {
			initializer {
				val application = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as YomiRuiApplication)
				val repository = application.container.repository
				YomiViewModel(repository)
			}
		}
	}

}