package com.example.kaspresso_learning.utils

import kotlin.random.Random

object Util {
    fun getRandom(): Int {
        val randomNumber = Random.nextInt(4)
        return randomNumber
    }
}