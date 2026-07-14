package com.example.kaspresso_learning.screens

import com.example.kaspresso_learning.Tags
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

object NewOrderScreen : ComposeScreen<NewOrderScreen>() {

    val newBrewingTeaButton: KNode = child {
        hasTestTag(Tags.BREWING_SELECT_TEA)
    }

    val teaIndexList: KNode = child {
        hasTestTag(Tags.TEA_SELECT_CONTAINER)
    }

    fun teaItem(tea: String): KNode = child {
        hasText(tea)
    }

    fun teaItem(index: Int): KNode = child {
        hasTestTag("${Tags.TEA_ITEM}_$index")
    }
}