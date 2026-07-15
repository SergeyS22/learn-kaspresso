package com.example.kaspresso_learning.screens

import com.example.kaspresso_learning.Tags
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode
import androidx.compose.ui.test.hasTestTag as matchTag


object ProfileScreen : ComposeScreen<ProfileScreen>() {

    val profileCount: KNode = child {
        hasTestTag(Tags.PROFILE_COUNT)
    }

    val logoutButton: KNode = child {
        hasTestTag(Tags.PROFILE_LOGOUT)
    }

    fun profileHistoryItem(item: Int): KNode = child {
        hasTestTag("${Tags.PROFILE_HISTORY_ITEM}_$item")
    }

    fun teaTypeOnHistoryCard(item: Int, teaDescriptionIntoCardHistory: String): KNode = child {
        hasText(teaDescriptionIntoCardHistory)
        hasAnyAncestor (matchTag("${Tags.PROFILE_HISTORY_ITEM}_$item"))
    }
}