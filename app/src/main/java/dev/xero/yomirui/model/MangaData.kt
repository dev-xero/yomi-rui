package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class MangaData(
    val data: List<Data>
)