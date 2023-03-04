package dev.xero.yomirui.repository

import dev.xero.yomirui.model.MangaData

interface YomiRuiRepositoryInterface {
	suspend fun getTopManga(): MangaData
}