package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class Large(
    val height: Int,
    val width: Int
)