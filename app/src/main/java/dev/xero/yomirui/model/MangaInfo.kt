package dev.xero.yomirui.model
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MangaInfo (
	val images: List<List<String>>,
	val title: String,
	@SerialName("title_japanese")
	val japaneseTitle: String,
	val published: List<List<List<String>>>,
	val synopsis: String,
	val chapters: Int
)