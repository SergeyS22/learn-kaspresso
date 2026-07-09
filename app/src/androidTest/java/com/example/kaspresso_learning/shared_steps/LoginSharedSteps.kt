package com.example.kaspresso_learning.shared_steps

import com.example.kaspresso_learning.resources.TestResources
import com.example.kaspresso_learning.steps.AvatarSelectSteps
import com.example.kaspresso_learning.steps.NameInputSteps

object LoginSharedSteps {

    fun login(avatarIndex: Int = 0, userName: String = TestResources.LOGIN) {
        AvatarSelectSteps.selectAvatar(avatarIndex)
        AvatarSelectSteps.clickNextBtn()
        NameInputSteps.typeNameInput(userName)
        NameInputSteps.clickEnterButton()

    }
}