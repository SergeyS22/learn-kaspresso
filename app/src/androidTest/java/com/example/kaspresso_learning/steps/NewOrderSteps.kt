package com.example.kaspresso_learning.steps

import androidx.compose.ui.test.ExperimentalTestApi
import com.example.kaspresso_learning.screens.NewOrderScreen

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
        NewOrderScreen {
            with(teaIndexList(index)) {
                performScrollToIndex(index)
            }
        }
    }

    @OptIn(ExperimentalTestApi::class)
    fun scrollToItemByNode(teaItem: String) {
        NewOrderScreen {
            with(teaNameItem(teaItem)) {
                assertIsDisplayed()
            }
        }
    }


    @OptIn(ExperimentalTestApi::class)
    fun checkTeaItemDisplayed(teaItem: Int, teaItemName: String) {
        NewOrderScreen{
            with(teaItemContainer(teaItem)) {
                assertIsDisplayed()
                assertTextEquals(teaItemName)
            }
        }
    }

    fun choseTeaType(teaType: String) {
        NewOrderScreen {
            with(teaItemContainer(teaType)) {
                assertIsDisplayed()
                performClick()
            }
        }
    }


}