package com.inhouse.nytimesarticleapp.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Article(
    val id: Long,
    val url: String,
    val source: String,
    @Json(name = "published_date") val publishedDate: String,
    val updated: String,
    val section: String,
    @Json(name = "subsection") val subSection: String,
    @Json(name = "byline") val byLine: String,
    val title: String,
    @Json(name = "des_facet") val desFacetList: List<String>,
    @Json(name = "media") val mediaList: List<Media>
) : Parcelable
