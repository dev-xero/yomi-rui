package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class Tiny(
    val height: Int,
    val width: Int
)