package com.example.kaspresso_learning

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import kotlin.random.Random

class NameEditScreenTest: TestCase() {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun checkChoosingAvatarAndPressNextButton() = run {

        step("Выбрать любой аватар") {
            val randomNumber = Random.nextInt(4)
                composeTestRule
                    .onNodeWithTag("${Tags.AVATAR_ICON}_$randomNumber")
                    .performClick()
        }

        step("Нажать кнопку Далее") {
            composeTestRule
                .onNodeWithTag(Tags.AVATAR_NEXT_BUTTON)
                .performClick()
        }

        step("Проверка экрана Как вас зовут?") {
            composeTestRule
                .onNodeWithTag(Tags.NAME_INPUT_TITLE)
                .assertTextEquals("Как вас зовут?")

            composeTestRule
                .onNodeWithTag(Tags.NAME_INPUT_TEXT)
                .isDisplayed()

            composeTestRule
                .onNodeWithText("Войти")
                .isDisplayed()
        }

    }

}