package dev.xero.yomirui.api

import dev.xero.yomirui.model.MangaInfo
import retrofit2.http.GET

interface YomiRuiApiServiceInterface {
	@GET("top/manga")
	suspend fun getTopManga(): List<MangaInfo>
}