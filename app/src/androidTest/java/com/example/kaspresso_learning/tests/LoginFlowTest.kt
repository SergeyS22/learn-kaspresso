package com.example.kaspresso_learning.tests

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.example.kaspresso_learning.Tags
import com.example.kaspresso_learning.BaseTestCase
import com.example.kaspresso_learning.resources.TestResources.LOGIN
import com.example.kaspresso_learning.steps.AvatarSelectSteps
import com.example.kaspresso_learning.utils.Util
import org.junit.Test

class LoginFlowTest : BaseTestCase() {

    @Test
    fun loginToFeed() = run {
        step("Нажать на второй аватар") {
            AvatarSelectSteps.selectAvatar(Util.getRandom())
        }

        step("Нажать 'Далее'") {
            AvatarSelectSteps.clickNextBtn()
        }

        step("Ввести имя «Тестер» в поле ввода") {
            composeTestRule
                .onNodeWithTag(Tags.NAME_INPUT_TEXT)
                .assertIsDisplayed()
                .performTextInput(LOGIN)
        }

        step("Нажать на кнопку «Войти»") {
            composeTestRule
                .onNodeWithTag(Tags.NAME_INPUT_LOGIN_BUTTON)
                .assertIsDisplayed()
                .performClick()
        }

        step("Проверить отображение заголовка-приветствие на экране ленты") {
            composeTestRule
                .onNodeWithTag(Tags.FEED_TITLE)
                .assertIsDisplayed()
                .assertTextContains("Тестер", substring = true)
        }

        step("Проверить отображение поста") {
            composeTestRule
                .onNodeWithTag("${Tags.FEED_POST}_0")
                .assertIsDisplayed()
        }
    }
}