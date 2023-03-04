package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class CoverImage(
    val large: String,
    val meta: Meta,
    val original: String,
    val small: String,
    val tiny: String
)