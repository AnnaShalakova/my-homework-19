package ru.tinkoff.fintech.meowle.meowle.espresso

import androidx.test.espresso.Espresso
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.tinkoff.fintech.meowle.R
import ru.tinkoff.fintech.meowle.meowle.screens.espresso.EspressoCatDetailsScreen
import ru.tinkoff.fintech.meowle.meowle.screens.espresso.EspressoRatingScreen
import ru.tinkoff.fintech.meowle.presentation.MainActivity
import ru.tinkoff.fintech.meowle.screens.uiautomator.NavigationBarElements

@RunWith(AndroidJUnit4::class)
class EspressoRatingTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    val navigationBar = NavigationBarElements()
    val ratingScreen = EspressoRatingScreen()
    val catDetailsScreen = EspressoCatDetailsScreen()

    //Кейс 7. Лайк топового котика
    @Test
    fun likeTopCat() {
        navigationBar.clickRating()
        ratingScreen.clickTopCatInRatingList()
        catDetailsScreen.clickLike()
        Espresso.pressBack()
        //здесь тоже не смогла довести до конца(( пыталась вытащить количество лайков и сравнить потом но никак
        //если я правильно поняла лайки хранятся с типом String а затем через toInt их нужно конвертнуть в число
        //6 кейс добавлением фото я тоже не осилила((
    }
}