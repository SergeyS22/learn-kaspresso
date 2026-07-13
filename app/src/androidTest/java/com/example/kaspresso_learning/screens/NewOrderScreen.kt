package com.example.kaspresso_learning.screens

import com.example.kaspresso_learning.Tags
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode
import androidx.compose.ui.test.hasTestTag as matchTag
import androidx.compose.ui.test.hasText as matchText

object NewOrderScreen : ComposeScreen<NewOrderScreen>() {

    val newBrewingTeaButton : KNode = child {
        hasTestTag(Tags.BREWING_SELECT_TEA)
    }

    fun teaNameType(teaType: String) : KNode = child {
        hasAnySibling(matchTag(Tags.TEA_TYPE) and matchText(teaType))
    }

    fun teaNameItem(teaItem: String) : KNode = child {
        hasAnySibling(matchTag(Tags.TEA_ITEM) and matchText(teaItem))
    }

    fun teaIndexList(index: Int): KNode = child {
        hasTestTag("${Tags.TEA_ITEM}_$index")
    }

    val teaItemContainer : KNode = child {
        hasTestTag(Tags.TEA_SELECT_CONTAINER)
    }

}