package com.example.kaspresso_learning.screens

import com.example.kaspresso_learning.Tags
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode
import androidx.compose.ui.test.hasTestTag as matchTag
import androidx.compose.ui.test.hasText as matchText

object FeedScreen : ComposeScreen<FeedScreen>() {

    val feedScreenFabButton: KNode = child {
        hasTestTag(Tags.FEED_FAB)
    }

    val profileButton: KNode = child {
        hasTestTag(Tags.BREWING_PROFILE)
    }

    fun teaNameOnCard(authorName: String): KNode = child {
        hasTestTag(Tags.FEED_POST_TEA_NAME)
        hasAnySibling(matchTag(Tags.FEED_POST_AUTHOR_NAME) and matchText(authorName))
    }

    fun teaTypeOnCard(authorName: String): KNode = child {
        hasTestTag(Tags.FEED_POST_TEA_TYPE)
        hasAnySibling(matchTag(Tags.FEED_POST_AUTHOR_NAME) and matchText(authorName))
    }

    fun weightOnCard(authorName: String): KNode = child {
        hasTestTag(Tags.FEED_POST_WEIGHT)
        hasAnySibling(matchTag(Tags.FEED_POST_AUTHOR_NAME) and matchText(authorName))
    }

    fun volumeOnCard(authorName: String): KNode = child {
        hasTestTag(Tags.FEED_POST_VOLUME)
        hasAnySibling(matchTag(Tags.FEED_POST_AUTHOR_NAME) and matchText(authorName))
    }

    fun vesselOnCard(authorName: String): KNode = child {
        hasTestTag(Tags.FEED_POST_VESSEL)
        hasAnySibling(matchTag(Tags.FEED_POST_AUTHOR_NAME) and matchText(authorName))
    }
}