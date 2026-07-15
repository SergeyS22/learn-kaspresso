package com.example.kaspresso_learning.tests

import com.example.kaspresso_learning.BaseTestCase
import com.example.kaspresso_learning.resources.TestResources
import com.example.kaspresso_learning.shared_steps.LoginSharedSteps
import com.example.kaspresso_learning.steps.FeedSteps
import com.example.kaspresso_learning.steps.NewOrderSteps
import com.example.kaspresso_learning.steps.ProfileSteps
import org.junit.Test

class E2EFinalTest : BaseTestCase() {

    @Test
    fun e2eFinalTest() = run {
        step("Авторизация") {
            LoginSharedSteps.login()
        }

        step("Нажать FAB") {
            FeedSteps.clickFeedScreenFabButton()
        }

        step("Нажать «Выбрать чай»") {
            NewOrderSteps.clickNewBrewingTeaButton()
        }

        step("Выбрать чай Улун") {
            NewOrderSteps.choseTeaType("Улун")
        }

        step("Проскроллить с помощью performScrollToNode до последнего Ми Лань Сян (Медовая Орхидея)") {
            NewOrderSteps.scrollToItemByNode("Ми Лань Сян (Медовая Орхидея)")
            NewOrderSteps.assertTeaTypeDisplayed("Ми Лань Сян (Медовая Орхидея)")
            NewOrderSteps.choseTeaType("Ми Лань Сян (Медовая Орхидея)")
        }

        step("Ввести вес 6") {
            NewOrderSteps.inputWeight("6")
        }

        step("Выбрать посуду — Гайвань") {
            NewOrderSteps.chooseGaiwan()
        }

        step("Ввести объём — 100") {
            NewOrderSteps.inputVolume("100")
        }

        step("Выбрать количество проливов - 5") {
            NewOrderSteps.clickNumbersOfInfusionsList()
            NewOrderSteps.chooseInfusionNumber(5)
        }

        step("Нажать «Сохранить»") {
            NewOrderSteps.clickSaveButton()
        }

        step("Проверить новую карточку в ленте") {
            FeedSteps.assertDataOnCard(TestResources.LOGIN,
                "Ми Лань Сян (Медовая Орхидея)",
                "Улун",
                "6 г",
                "100 мл",
                "Гайвань")
        }

        step("Перейти в Профиль (через нижнюю навигацию)") {
            FeedSteps.clickProfileButton()
        }

        step("Проверить запись в профиле") {
            ProfileSteps.assertTeaNameOnHistoryCard(0, "Ми Лань Сян (Медовая Орхидея)")
            ProfileSteps.assertTeaDetailsOnHistoryCard(0, "Улун · 6 г · 100 мл · Гайвань · 5 прол.")
        }

    }
}