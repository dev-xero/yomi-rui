package dev.xero.yomirui.model

import kotlinx.serialization.Serializable

@Serializable
data class Titles(
    val ar: String?,
    val en: String?,
    val en_cn: String?,
    val en_jp: String?,
    val en_kr: String?,
    val en_us: String?,
    val he_il: String?,
    val ja_jp: String?,
    val ko_kr: String?,
    val lt_lt: String?,
    val pl_pl: String?,
    val ru_ru: String?,
    val th_th: String?,
    val tr_tr: String?,
    val vi_vn: String?,
    val zh_cn: String?,
    val zh_tw: String?
)