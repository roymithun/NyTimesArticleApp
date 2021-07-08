package com.inhouse.nytimesarticleapp.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class MediaMetadata(
    val url: String,
    val format: String,
    val height: Int,
    val width: Int
) : Parcelable