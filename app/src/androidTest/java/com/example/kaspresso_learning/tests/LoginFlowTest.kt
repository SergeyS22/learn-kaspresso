package com.example.kaspresso_learning.tests

import com.example.kaspresso_learning.BaseTestCase
import com.example.kaspresso_learning.resources.TestResources.LOGIN
import com.example.kaspresso_learning.steps.AvatarSelectSteps
import com.example.kaspresso_learning.steps.NameInputSteps
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
            NameInputSteps.typeNameInput(LOGIN)
        }

        step("Нажать на кнопку «Войти»") {
            NameInputSteps.clickEnterButton()
        }

        step("Проверить отображение заголовка-приветствие на экране ленты") {

        }

        step("Проверить отображение поста") {

        }
    }
}