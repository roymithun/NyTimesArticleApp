package com.inhouse.nytimesarticleapp.data.local

import com.inhouse.nytimesarticleapp.model.Article
import com.inhouse.nytimesarticleapp.model.Media
import com.inhouse.nytimesarticleapp.model.MediaMetadata

object FakeArticlesData {
    val articles = listOf(
        Article(
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
        ),
        Article(
            id = 100000007838438,
            source = "New York Times",
            url = "https://www.nytimes.com/2021/07/04/sports/basketball/espn-rachel-nichols-maria-taylor.html",
            publishedDate = "2021-07-01",
            updatedDate = "2021-07-02 10:24:00",
            section = "Sports",
            subSection = "N.B.A.",
            byLine = "By Ben Protess, William K. Rashbaum and Jonah E. Bromwich",
            title = "A Disparaging Video Prompts Explosive Fallout Within ESPN",
            desFacetList = listOf(
                "Tax Evasion",
                "United States Politics and Government"
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
        ), Article(
            id = 100000007846960,
            source = "New York Times",
            url = "https://www.nytimes.com/2021/07/04/sports/basketball/espn-rachel-nichols-maria-taylor.html",
            publishedDate = "2021-07-04",
            updatedDate = "2021-07-06 18:00:39",
            section = "Sports",
            subSection = "N.B.A.",
            byLine = "By Kevin Draper and Juliet Macur",
            title = "A Disparaging Video Prompts Explosive Fallout Within ESPN",
            desFacetList = listOf(
                "Track and Field",
                "Olympic Games (2020)",
                "Marijuana"
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
    )
}