package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class Medium(
    val height: Int,
    val width: Int
)