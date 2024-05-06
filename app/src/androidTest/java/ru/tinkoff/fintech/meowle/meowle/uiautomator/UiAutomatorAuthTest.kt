package ru.tinkoff.fintech.meowle.uiautomator

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.tinkoff.fintech.meowle.meowle.screens.uiautomator.UiAutomatorSettingsScreen
import ru.tinkoff.fintech.meowle.presentation.view.AuthActivity
import ru.tinkoff.fintech.meowle.screens.uiautomator.NavigationBarElements
import ru.tinkoff.fintech.meowle.screens.uiautomator.UiAutomatorAuthScreen

@RunWith(AndroidJUnit4::class)
class UiAutomatorAuthTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(AuthActivity::class.java)

    val authScreen = UiAutomatorAuthScreen()
    val navigationBar = NavigationBarElements()
    val settingsScreen = UiAutomatorSettingsScreen()

    val name = "Анна"
    val phone = "+79999999999"

    //Кейс 1. Разлогин
    @Test
    fun authAndLogOut() {
        authScreen.enterName(name)
        authScreen.enterPhone(phone)
        authScreen.clickSubmit()
        navigationBar.clickSettings()
        settingsScreen.clickLogout()
        authScreen.checkTitle()
    }

    //Кейс 2. Проверка подстановки имени в экран настроек после авторизации
    @Test
    fun checkNameInSettings() {
        authScreen.enterName(name)
        authScreen.enterPhone(phone)
        authScreen.clickSubmit()
        navigationBar.clickSettings()
        settingsScreen.checkNameInButtonLogOut(name)
    }
}
