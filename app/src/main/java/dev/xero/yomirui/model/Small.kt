package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class Small(
    val height: Int,
    val width: Int
)