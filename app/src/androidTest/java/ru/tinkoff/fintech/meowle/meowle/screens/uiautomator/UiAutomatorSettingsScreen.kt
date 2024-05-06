package ru.tinkoff.fintech.meowle.meowle.screens.uiautomator

import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until
import org.junit.Assert
import ru.tinkoff.fintech.meowle.screens.uiautomator.BaseUiAutomatorScreen

class UiAutomatorSettingsScreen: BaseUiAutomatorScreen() {
    private val logoutButton = By.res("ru.tinkoff.fintech.meowle", "logout_btn")
    private val waitTimeout = 3_000L

    //клик Выйти
    fun clickLogout() {
        uiDevice.wait(Until.findObject(logoutButton), waitTimeout).click()
    }

    //проверка имени в кнопке разлогина
    fun checkNameInButtonLogOut(name: String) {
        val actualTitleText = waitFindObject(logoutButton).text
        Assert.assertEquals("Выйти из аккаунта $name", actualTitleText)
    }
}