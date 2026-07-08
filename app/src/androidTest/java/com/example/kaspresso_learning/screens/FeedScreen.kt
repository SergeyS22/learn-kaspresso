package com.example.kaspresso_learning.screens

import com.example.kaspresso_learning.Tags
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

object FeedScreen : ComposeScreen<FeedScreen>(){

    val feedTitle : KNode = child {
        hasTestTag(Tags.FEED_TITLE)
    }

    fun feedPost(index: Int, function: () -> Unit) : KNode = child {
        hasTestTag("${Tags.FEED_POST}_$index")
    }

    val feedPostAvatar : KNode = child {
        hasTestTag(Tags.FEED_POST_AVATAR)
    }

    val feedPostAuthorName: KNode = child {
        hasTestTag(Tags.FEED_POST_AUTHOR_NAME)
    }

    val feedPostDate: KNode = child {
        hasTestTag(Tags.FEED_POST_DATE)
    }

    val feedPostTeaName: KNode = child {
        hasTestTag(Tags.FEED_POST_TEA_NAME)
    }

    val feedPostTeaType: KNode = child {
        hasTestTag(Tags.FEED_POST_TEA_TYPE)
    }

    val feedPostWeightGrams: KNode = child {
        hasTestTag(Tags.FEED_POST_WEIGHT)
    }

    val feedPostVolumeMl: KNode = child {
        hasTestTag(Tags.FEED_POST_VOLUME)
    }

    val feedPostVessel: KNode = child {
        hasTestTag(Tags.FEED_POST_VESSEL)
    }

    val feedScreenFabButton: KNode = child {
        hasTestTag(Tags.FEED_FAB)
    }

    val feedProfileButton: KNode = child {
        hasText("Профиль")
    }

    val feedButton: KNode = child {
        hasText("Лента")
    }

}