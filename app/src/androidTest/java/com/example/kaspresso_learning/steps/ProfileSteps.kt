package com.example.kaspresso_learning.steps

import com.example.kaspresso_learning.screens.ProfileScreen

object ProfileSteps {

    fun assertTeaDataOnHistoryCard(carItem: Int, teaDescriptionIntoCardHistory: String) {
        ProfileScreen
            .teaTypeOnHistoryCard(carItem, teaDescriptionIntoCardHistory)
            .assertTextContains(teaDescriptionIntoCardHistory)
    }
}