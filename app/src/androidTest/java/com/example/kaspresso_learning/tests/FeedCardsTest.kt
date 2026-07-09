package com.example.kaspresso_learning.tests

import com.example.kaspresso_learning.BaseTestCase
import com.example.kaspresso_learning.shared_steps.LoginSharedSteps
import com.example.kaspresso_learning.steps.FeedSteps
import org.junit.Test

//@RunWith(Parameterized::class)
class FeedCardsTest : BaseTestCase() {

    @Test
    fun feedCard1Test() = run {
        step("Выполняем логин с параметром:") {
            LoginSharedSteps.login(0, "Алексей")
        }

        step("Проверяем данные на карточке 1") {
            FeedSteps.assertDataOnCard("Алексей",
                "Сенча",
                "Зелёный",
                "5г",
                "150мл",
                "Гайвань")
        }
    }

    @Test
    fun feedCard2Test() = run {
        step("Выполняем логин с параметром:") {
            LoginSharedSteps.login(2, "Мария")
        }
        step("Проверяем данные на карточке 2") {
            FeedSteps.assertDataOnCard("Мария",
                "Ассам",
                "Красный",
                "7г",
                "200мл",
                "Чайник")
        }
    }

    @Test
    fun feedCard3Test() = run {
        step("Выполняем логин с параметром:") {
            LoginSharedSteps.login(1, "Дмитрий")
        }
        step("Проверяем данные на карточке 3") {
            FeedSteps.assertDataOnCard(
                "Дмитрий",
                "Да Хун Пао",
                "Улун",
                "8г",
                "250мл",
                "Гайвань")
        }
    }

//    companion object {
//        @JvmStatic
//        @Parameterized.Parameters(name = "Login: {0}: {1}, {2}, {3}, {4}, {5}")
//        fun data(): Collection<Array<Any>> {
//            return listOf(
//                arrayOf("Алексей", "Сенча", "Зелёный", "5г", "150мл", "Гайвань"),
//                arrayOf("Мария", "Ассам", "Красный", "7г", "200мл", "Чайник"),
//                arrayOf("Дмитрий", "Да Хун Пао", "Улун", "8г", "250мл", "Гайвань"),
//            )
//        }
//    }
}