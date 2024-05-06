package ru.tinkoff.fintech.meowle.screens.uiautomator

import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until
import org.junit.Assert
import ru.tinkoff.fintech.meowle.R

class UiAutomatorAuthScreen: BaseUiAutomatorScreen() {

    private val nameField = By.res("ru.tinkoff.fintech.meowle", "et_name")
    private val phoneField = By.res("ru.tinkoff.fintech.meowle", "et_phone")
    private val submitButton = By.res("ru.tinkoff.fintech.meowle", "submit_button")
    private val authTitle = By.res("ru.tinkoff.fintech.meowle", "tw_person_screen_title")
    private val waitTimeout = 3_000L

    //ввод имени
    fun enterName(name: String) {
        uiDevice.wait(Until.findObject(nameField), waitTimeout).text = name
    }
    //ввод телефона
    fun enterPhone(phone: String) {
        uiDevice.wait(Until.findObject(phoneField), waitTimeout).text = phone
    }
    //клик войти
    fun clickSubmit() {
        uiDevice.wait(Until.findObject(submitButton), waitTimeout).click()
    }

    //проверка заголовка экрана авторизации
    fun checkTitle() {
        val actualTitleText = waitFindObject(authTitle).text
        val expectedTitleText = resourceString(R.string.auth_title)
        Assert.assertEquals(expectedTitleText, actualTitleText)
    }
}