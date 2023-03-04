package dev.xero.yomirui.repository

import dev.xero.yomirui.api.YomiRuiApiServiceInterface
import dev.xero.yomirui.model.MangaData

class YomiRuiRepositoryImplementation(
	private val apiService: YomiRuiApiServiceInterface
) : YomiRuiRepositoryInterface {
	override suspend fun getTopManga(): MangaData = apiService.getTopManga()
}