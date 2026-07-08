package com.example.kaspresso_learning

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.example.kaspresso_learning.resources.TestResources.LOGIN
import com.example.kaspresso_learning.utills.Utils
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class LoginFlowTest: TestCase() {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    val utils = Utils()

    @Test
    fun checkLoginFlow() = run {
        step("Выбрать аватар") {
            composeTestRule
                .onNodeWithTag("${Tags.AVATAR_ICON}_${utils.getRandom()}")
                .performClick()
        }
        step("Нажать кнопку «Далее»") {
            composeTestRule
                .onNodeWithTag(Tags.AVATAR_NEXT_BUTTON)
                .performClick()
        }
        step("Ввести имя «Тестер» в поле ввода") {
            composeTestRule
                .onNodeWithTag(Tags.NAME_INPUT_TEXT)
                .performTextInput(LOGIN)
        }
        step("Нажать кнопку «Войти» по новому тегу") {
            composeTestRule
                .onNodeWithTag(Tags.NAME_INPUT_LOGIN_BUTTON)
                .performClick()
        }
        step("Проверки открытия ленты") {
            composeTestRule
                .onNodeWithTag(Tags.FEED_TITLE )
                .assertTextEquals("Привет, ${LOGIN}!")

            composeTestRule
                .onNodeWithTag("${Tags.FEED_POST}_${0}")
                .isDisplayed()

        }

    }
}