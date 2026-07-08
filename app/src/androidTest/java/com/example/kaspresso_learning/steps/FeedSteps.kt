package com.example.kaspresso_learning.steps

import com.example.kaspresso_learning.screens.FeedScreen

object FeedSteps {

    fun clickFeedScreenFabButton() {
        FeedScreen {
            feedScreenFabButton {
                assertIsDisplayed()
                performClick()
            }
        }
    }

    fun clickFeedButton() {
        FeedScreen {
            feedButton {
                assertIsDisplayed()
                performClick()
            }
        }
    }

    fun clickProfileButton() {
        FeedScreen {
            feedProfileButton {
                assertIsDisplayed()
                performClick()
            }
        }
    }

    fun asserCardParamsDisplayed(index: Int) {
        FeedScreen {
            feedPost(index) {
                feedPostAuthorName {
                    assertIsDisplayed()
                }
                feedPostDate{
                    assertIsDisplayed()
                }
                feedPostTeaName{
                    assertIsDisplayed()
                }

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