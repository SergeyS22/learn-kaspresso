package com.example.kaspresso_learning.steps

import com.example.kaspresso_learning.screens.FeedScreen

object FeedSteps {

    fun assertGreetingTitleIsDisplayed(name: String) {
        FeedScreen {
            greetingTitle {
                assertIsDisplayed()
                assertTextEquals("Привет, $name!")
            }
        }
    }

    fun clickFeedScreenFabButton() {
        FeedScreen {
            feedScreenFabButton {
                assertIsDisplayed()
                performClick()
            }
        }
    }

    fun clickProfileButton() {
        FeedScreen {
            profileButton {
                assertIsDisplayed()
                performClick()
            }
        }
    }

    fun assertDataOnCard(
        authorName: String,
        expectedTeaName: String,
        expectedTeaType: String,
        expectedWeight: String,
        expectedVolume: String,
        expectedVessel: String
    ) {
        FeedScreen {
            with(teaNameOnCard(authorName)) {
                assertIsDisplayed()
                assertTextEquals(expectedTeaName)
            }
            with(teaTypeOnCard(authorName)) {
                assertIsDisplayed()
                assertTextEquals(expectedTeaType)
            }
            with(weightOnCard(authorName)) {
                assertIsDisplayed()
                assertTextEquals(expectedWeight)
            }
            with(volumeOnCard(authorName)) {
                assertIsDisplayed()
                assertTextEquals(expectedVolume)
            }
            with(vesselOnCard(authorName)) {
                assertIsDisplayed()
                assertTextEquals(expectedVessel)
            }


        }
    }

    fun upScroll() {
        FeedScreen {
            performTouchInput {
                upScroll()
            }
        }
    }

    fun downScroll() {
        FeedScreen {
            performTouchInput {
                downScroll()
            }
        }
    }
}