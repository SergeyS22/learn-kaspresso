package com.example.kaspresso_learning.tests

import com.example.kaspresso_learning.BaseTestCase
import com.example.kaspresso_learning.steps.AvatarSelectSteps
import com.example.kaspresso_learning.steps.NameInputSteps
import com.example.kaspresso_learning.utils.Util
import org.junit.Test

class NameEditScreenTest : BaseTestCase() {

    @Test
    fun checkNameEditScreen() = run {
        step("Нажать на второй аватар") {
            AvatarSelectSteps.selectAvatar(Util.getRandom())
        }

        step("Нажать 'Далее'") {
            AvatarSelectSteps.clickNextBtn()
        }

        step("Проверить, что открылся экран ввода имени") {

            step("Проверить заголовок «Как вас зовут?»") {
                NameInputSteps.assertTitleDisplayed()

            }

            step("Проверить отображение поля ввода имени") {
                NameInputSteps.assertNameInputDisplayed()
            }

            step("Проверить отображение кнопки 'Войти'") {
                NameInputSteps.assertEnterButtonDisplayed()
            }
        }
    }
}