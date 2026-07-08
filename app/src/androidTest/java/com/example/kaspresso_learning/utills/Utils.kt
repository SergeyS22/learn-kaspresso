package com.example.kaspresso_learning.utills

import kotlin.random.Random

class Utils {
    fun getRandom(): Int {
        val randomNumber = Random.nextInt(4)
        return randomNumber
    }
}