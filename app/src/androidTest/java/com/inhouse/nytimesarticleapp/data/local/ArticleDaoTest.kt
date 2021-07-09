package com.inhouse.nytimesarticleapp.data.local

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.filters.SmallTest
import com.google.common.truth.Truth
import com.inhouse.nytimesarticleapp.model.Article
import com.inhouse.nytimesarticleapp.model.Media
import com.inhouse.nytimesarticleapp.model.MediaMetadata
import com.inhouse.nytimesarticleapp.utils.getOrAwaitValue
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@ExperimentalCoroutinesApi
@SmallTest
@HiltAndroidTest
class ArticleDaoTest {
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var dao: ArticleDao

    @Before
    fun setUp() {
        hiltRule.inject()
    }

    @Test
    fun insertArticles_checkIfAllValuesArePresentInDb() = runBlockingTest {
        val article1 = Article(
            id = 100000007779268,
            source = "New York Times",
            url = "https://www.nytimes.com/2021/07/04/sports/basketball/espn-rachel-nichols-maria-taylor.html",
            publishedDate = "2021-07-04",
            updatedDate = "2021-07-06 13:15:32",
            section = "Sports",
            subSection = "N.B.A.",
            byLine = "By Kevin Draper",
            title = "A Disparaging Video Prompts Explosive Fallout Within ESPN",
            desFacetList = listOf(
                "Television",
                "Black People"
            ),
            mediaList = listOf(
                Media(
                    id = 1,
                    type = "image",
                    subType = "photo",
                    caption = "Maria Taylor, at left front, considered refusing to appear on ESPN’s “NBA Countdown” along with her costars, from left, Jalen Rose, Adrian Wojnarowski and Jay Williams. Rachel Nichols, right, was heard on a video making disparaging comments about Taylor. Jimmy Pitaro, center, ESPN’s president, has tried to smooth over the relationships.",
                    copyright = "Eleanor Shakespeare",
                    mediaMetadataList = listOf(
                        MediaMetadata(
                            id = 1,
                            url = "https://static01.nyt.com/images/2021/07/01/sports/espn-illustration/espn-illustration-thumbStandard.jpg",
                            format = "Standard Thumbnail",
                            height = 75,
                            width = 75
                        )
                    )
                )
            )
        )
        val articleList = listOf(article1)

        dao.insertArticleList(articleList)

        val insertedArticles: List<Article> = dao.getAllArticles().getOrAwaitValue()

        Truth.assertThat(insertedArticles.first().id).isEqualTo(100000007779268)
    }
}