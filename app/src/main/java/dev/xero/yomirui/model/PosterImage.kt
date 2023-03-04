package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class PosterImage(
    val large: String,
    val medium: String,
    val meta: MetaX,
    val original: String,
    val small: String,
    val tiny: String
)