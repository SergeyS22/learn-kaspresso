package com.example.kaspresso_learning.steps

import com.example.kaspresso_learning.screens.NameInputScreen

object NameInputSteps {

    fun typeNameInput(text: String) {
        NameInputScreen {
            nameInput {
                assertIsDisplayed()
                performTextInput(text)
            }
        }
    }

    fun clickEnterButton() {
        NameInputScreen {
            enterButton {
                assertIsDisplayed()
                performClick()
            }
        }
    }

    fun assertTitleDisplayed() {
        NameInputScreen {
            nameInputTitle {
                assertIsDisplayed()
                assertTextEquals("Как вас зовут?")
            }
        }
    }

    fun assertNameInputDisplayed() {
        NameInputScreen.nameInput.assertIsDisplayed()
    }

    fun assertEnterButtonDisplayed() {
        NameInputScreen.enterButton.assertIsDisplayed()
    }
}