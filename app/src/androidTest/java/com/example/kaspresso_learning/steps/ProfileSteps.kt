package com.example.kaspresso_learning.steps

import com.example.kaspresso_learning.screens.ProfileScreen

object ProfileSteps {

    fun assertTeaNameOnHistoryCard(carItem: Int, teaDescriptionIntoCardHistory: String) {
        ProfileScreen
            .teaTypeOnHistoryCard(carItem, teaDescriptionIntoCardHistory)
            .assertTextEquals(teaDescriptionIntoCardHistory)
    }

    fun assertTeaDetailsOnHistoryCard(carItem: Int, details: String) {
        ProfileScreen
            .teaTypeOnHistoryCard(carItem, details)
            .assertTextEquals(details)
    }
}