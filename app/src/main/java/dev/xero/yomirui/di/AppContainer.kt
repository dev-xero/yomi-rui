package dev.xero.yomirui.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dev.xero.yomirui.api.YomiRuiApiServiceInterface
import dev.xero.yomirui.repository.YomiRuiRepositoryImplementation
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainerInterface {
	val repository: YomiRuiRepositoryImplementation
}

class AppContainer : AppContainerInterface {
	private val baseURL = "https://api.jikan.moe/v4"

	// SETUP RETROFIT INSTANCE
	@OptIn(ExperimentalSerializationApi::class)
	private val retrofit: Retrofit = Retrofit
		.Builder()
		.addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
		.baseUrl(baseURL)
		.build()

	// LAZY INIT API SERVICE
	private val apiService: YomiRuiApiServiceInterface by lazy {
		retrofit.create(YomiRuiApiServiceInterface::class.java)
	}

	// PASS API SERVICE TO THE REPOSITORY
	override val repository: YomiRuiRepositoryImplementation by lazy {
		YomiRuiRepositoryImplementation(apiService)
	}
}