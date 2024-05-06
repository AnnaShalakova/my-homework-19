package ru.tinkoff.fintech.meowle.meowle.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.tinkoff.fintech.meowle.meowle.screens.espresso.EspressoCatDetailsScreen
import ru.tinkoff.fintech.meowle.meowle.screens.espresso.EspressoFavouriteScreen
import ru.tinkoff.fintech.meowle.meowle.screens.espresso.EspressoRatingScreen
import ru.tinkoff.fintech.meowle.presentation.MainActivity
import ru.tinkoff.fintech.meowle.screens.uiautomator.NavigationBarElements
import androidx.test.espresso.Espresso


@RunWith(AndroidJUnit4::class)
class EspressoFavouriteTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    val navigationBar = NavigationBarElements()
    val ratingScreen = EspressoRatingScreen()
    val catDetailsScreen = EspressoCatDetailsScreen()
    val favouriteScreen = EspressoFavouriteScreen()

    //Кейс 9. Добавление в избранное из перехода в детали через рейтинг
    @Test
    fun addCatToFavouriteFromRating() {
        navigationBar.clickRating()
      //  Thread.sleep(2000)
        ratingScreen.clickTopCatInRatingList()
        catDetailsScreen.clickAddToFavourite()
        navigationBar.clickFavourite()
        //в этом не смогла вытащить текст из ячейки с котиком чтобы релализовать ОР
    }

    //Кейс 10. Удаление из избранного
    @Test
    fun deleteCatFromFavourite() {
        navigationBar.clickRating()
      //  Thread.sleep(2000)
        ratingScreen.clickTopCatInRatingList()
        catDetailsScreen.clickAddToFavourite()
        navigationBar.clickFavourite()
        favouriteScreen.clickTopCatInRatingList()
        catDetailsScreen.clickAddToFavourite()
        Espresso.pressBack()
        //в этом не смогла вытащить текст из ячейки с котиком чтобы релализовать ОР
    }
}