package dev.xero.yomirui.api

import dev.xero.yomirui.model.MangaData
import retrofit2.http.GET

interface YomiRuiApiServiceInterface {
	@GET("trending/manga")
	suspend fun getTopManga(): MangaData
}