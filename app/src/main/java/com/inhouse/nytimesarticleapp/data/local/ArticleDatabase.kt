package com.inhouse.nytimesarticleapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.inhouse.nytimesarticleapp.model.Article
import com.inhouse.nytimesarticleapp.model.Media
import com.inhouse.nytimesarticleapp.model.MediaMetadata

@Database(
    version = 1,
    entities = [Article::class, Media::class, MediaMetadata::class],
    exportSchema = true
)
@TypeConverters(RoomConverters::class)
abstract class ArticleDatabase : RoomDatabase() {
    abstract fun articleDao(): ArticleDao
}