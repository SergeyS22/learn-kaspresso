package com.example.kaspresso_learning.steps

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

//    fun scrollToItemByIndex(index: Int) {
//        NewOrderScreen {
//            teaIndexList(index) {
//                performScrollToIndex(index)
//            }
//
//        }
//    }

//    fun scrollToItemByIndex(index: Int) {
//        NewOrderScreen {
//            teaItemContainer {
//                performScrollToIndex(index)
//            }
//        }
//    }

    fun scrollToItemByIndex(index: Int) {
        NewOrderScreen {
            teaItemContainer {
//                performScrollToIndex(index) //?
            }
        }
    }

    fun checkTeaTypeDisplayed(teaType: String) {
        NewOrderScreen {
            with(teaNameType(teaType)) {
                assertIsDisplayed()
            }
        }
    }

    fun checkTeaItemDisplayed(teaItem: String) {
        NewOrderScreen {
            with(teaNameItem(teaItem)) {
                assertIsDisplayed()
            }
        }
    }

    fun choseTeaType(teaType: String) {
        NewOrderScreen {
            with(teaNameType(teaType)) {
                assertIsDisplayed()
                performClick()
            }
        }
    }

    fun choseItemType(teaItem: String) {
        NewOrderScreen {
            with(teaNameItem(teaItem)) {
                assertIsDisplayed()
                performClick()
            }
        }
    }

}