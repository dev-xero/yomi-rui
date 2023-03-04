package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class Relationships(
    val castings: Castings,
    val categories: Categories,
    val chapters: Chapters,
    val characters: Characters,
    val genres: Genres,
    val installments: Installments,
    val mangaCharacters: MangaCharacters,
    val mangaStaff: MangaStaff,
    val mappings: Mappings,
    val mediaRelationships: MediaRelationships,
    val productions: Productions,
    val quotes: Quotes,
    val reviews: Reviews,
    val staff: Staff
)