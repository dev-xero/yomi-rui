package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class Dimensions(
    val large: Large,
    val small: Small,
    val tiny: Tiny
)