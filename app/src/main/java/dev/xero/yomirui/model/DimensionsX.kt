package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class DimensionsX(
    val large: Large,
    val medium: Medium,
    val small: Small,
    val tiny: Tiny
)