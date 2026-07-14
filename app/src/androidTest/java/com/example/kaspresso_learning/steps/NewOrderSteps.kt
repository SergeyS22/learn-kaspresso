package com.example.kaspresso_learning.steps

import androidx.compose.ui.test.ExperimentalTestApi
import com.example.kaspresso_learning.screens.NewOrderScreen
import androidx.compose.ui.test.hasText as matchText

object NewOrderSteps {

    fun clickNewBrewingTeaButton() {
        NewOrderScreen {
            newBrewingTeaButton {
                assertIsDisplayed()
                performClick()
            }
        }
    }

    @OptIn(ExperimentalTestApi::class)
    fun scrollToItemByIndex(index: Int) {
        NewOrderScreen.teaIndexList.performScrollToIndex(index)
    }

    @OptIn(ExperimentalTestApi::class)
    fun scrollToItemByNode(teaItem: String) {
        NewOrderScreen.teaIndexList.performScrollToNode(matchText(teaItem))

    }

    fun checkTeaItemDisplayed(teaItem: Int, teaItemName: String) {
        NewOrderScreen {
            with(teaItem(teaItem)) {
                assertIsDisplayed()
                assertTextEquals(teaItemName)
            }
        }
    }

    fun choseTeaType(teaType: String) {
        NewOrderScreen {
            with(teaItem(teaType)) {
                assertIsDisplayed()
                performClick()
            }
        }
    }

    fun assertTeaTypeDisplayed(teaType: String) {
        NewOrderScreen {
            with(teaItem(teaType)) {
                assertIsDisplayed()
            }
        }
    }
}