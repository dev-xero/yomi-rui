package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class LinksX(
    val related: String,
    val self: String
)