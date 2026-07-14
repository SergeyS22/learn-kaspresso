package com.example.kaspresso_learning.screens

import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import com.example.kaspresso_learning.Tags
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode
import androidx.compose.ui.test.hasTestTag as matchTag
import androidx.compose.ui.test.hasText as matchText
import androidx.compose.ui.test.hasTestTag as hasTag


object NewOrderScreen : ComposeScreen<NewOrderScreen>() {

    val newBrewingTeaButton : KNode = child {
        hasTestTag(Tags.BREWING_SELECT_TEA)
    }

    fun teaNameItem(teaItem: String) : KNode = child {
        hasTestTag(Tags.TEA_ITEM)
        hasText(teaItem)
    }

    fun teaIndexList(index: Int): KNode = child {
        hasTestTag("${Tags.TEA_ITEM}_$index")
    }

    val teaIndexList: KNode = child {
        hasTestTag(Tags.TEA_SELECT_CONTAINER)
    }

    fun teaItemContainer(tea: String) : KNode = child {
        hasTestTag(Tags.TEA_SELECT_CONTAINER)
//        hasAnySibling(matchTag(Tags.TEA_SELECT_CONTAINER) and matchText(tea))
        androidx.compose.ui.test.hasAnySibling(matchText(tea))
    }

    fun teaItemContainer(index: Int) : KNode = child {
        hasTestTag(Tags.TEA_SELECT_CONTAINER)
        androidx.compose.ui.test.hasAnySibling(hasTag("${Tags.TEA_ITEM}_$index"))
    }

}