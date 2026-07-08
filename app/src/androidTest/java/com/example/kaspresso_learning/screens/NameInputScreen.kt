package com.example.kaspresso_learning.screens

import com.example.kaspresso_learning.Tags
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

object NameInputScreen : ComposeScreen<NameInputScreen>() {

    val nameInputTitle: KNode = child {
        hasTestTag(Tags.NAME_INPUT_TITLE)
    }

    val nameInput: KNode = child {
        hasTestTag(Tags.NAME_INPUT_TEXT)
    }

    val enterButton: KNode = child {
        hasTestTag(Tags.NAME_INPUT_LOGIN_BUTTON)
    }
}