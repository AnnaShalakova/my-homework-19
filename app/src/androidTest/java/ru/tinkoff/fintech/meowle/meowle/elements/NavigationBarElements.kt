package ru.tinkoff.fintech.meowle.screens.uiautomator

import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until

class NavigationBarElements {
    private val uiDevice = UiDevice.getInstance(getInstrumentation())
    private val tabRating = By.res("ru.tinkoff.fintech.meowle","tab_btn_rating")
    private val tabSearch = By.res("ru.tinkoff.fintech.meowle","tab_btn_search")
    private val tabAdd = By.res("ru.tinkoff.fintech.meowle","tab_btn_add")
    private val tabFavourite = By.res("ru.tinkoff.fintech.meowle","tab_btn_favourite")
    private val tabSettings = By.res("ru.tinkoff.fintech.meowle","tab_btn_settings")
    private val waitTimeout = 3_000L

    fun clickRating() {
        uiDevice.wait(Until.findObject(tabRating), waitTimeout).click()
    }
    fun clickSearch() {
        uiDevice.wait(Until.findObject(tabSearch), waitTimeout).click()
    }
    fun clickAdd() {
        uiDevice.wait(Until.findObject(tabAdd), waitTimeout).click()
    }
    fun clickFavourite() {
        uiDevice.wait(Until.findObject(tabFavourite), waitTimeout).click()
    }
    fun clickSettings() {
        uiDevice.wait(Until.findObject(tabSettings), waitTimeout).click()
    }
}