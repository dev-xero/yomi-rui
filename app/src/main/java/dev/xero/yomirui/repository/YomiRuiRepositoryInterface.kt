package dev.xero.yomirui.repository

import dev.xero.yomirui.model.MangaInfo

interface YomiRuiRepositoryInterface {
	suspend fun getTopManga(): List<MangaInfo>
}