package com.example.kaspresso_learning.tests

import com.example.kaspresso_learning.BaseTestCase
import com.example.kaspresso_learning.shared_steps.LoginSharedSteps
import com.example.kaspresso_learning.steps.FeedSteps
import com.example.kaspresso_learning.steps.NewOrderSteps
import org.junit.Test

class TeaCatalogScrollTest : BaseTestCase() {

    @Test
    fun teaCatalogScrollTest() = run {
        step("Авторизация в приложение") {
            LoginSharedSteps.login()
        }

        step("Нажать FAB (кнопка «+») для создания новой записи") {
            FeedSteps.clickFeedScreenFabButton()
        }

        step("Нажать «Выбрать чай»") {
            NewOrderSteps.clickNewBrewingTeaButton()
        }

        step("Выбрать категорию «Улун»") {
            NewOrderSteps.choseTeaType("Улун")
        }

        step("Проверить, что первый сорт списка — «Те Гуаньинь»") {
            NewOrderSteps.checkTeaItemDisplayed(18, "Те Гуаньинь")
        }

        step("Проскроллить список по индексу до элемента «Мао Се (Волосистый Краб)» (index 17) и проверить, что элемент отображается") {
            NewOrderSteps.scrollToItemByIndex(17)
            NewOrderSteps.assertTeaTypeDisplayed("Мао Се (Волосистый Краб)")
        }

        step("Проскроллить с помощью performScrollToNode до последнего Улуна — «Габа Али Шань»") {
            NewOrderSteps.scrollToItemByNode("Габа Али Шань")
            NewOrderSteps.assertTeaTypeDisplayed("Габа Али Шань")
        }

        step("Проскроллить обратно к началу списка (index 0) и убедиться, что «Те Гуаньинь» снова видна") {
            NewOrderSteps.scrollToItemByNode("Те Гуаньинь")
            NewOrderSteps.checkTeaItemDisplayed(18, "Те Гуаньинь")
        }

    }
}