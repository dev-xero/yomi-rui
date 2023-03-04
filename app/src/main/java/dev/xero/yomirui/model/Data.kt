package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class Data(
    val attributes: Attributes,
    val id: String,
    val links: Links,
    val relationships: Relationships,
    val type: String
)