package ru.tinkoff.fintech.meowle.meowle.espresso
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.tinkoff.fintech.meowle.meowle.screens.espresso.EspressoCatDetailsScreen
import ru.tinkoff.fintech.meowle.presentation.MainActivity
import ru.tinkoff.fintech.meowle.screens.espresso.EspressoSearchScreen

@RunWith(AndroidJUnit4::class)
class EspressoSearchTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    val searchScreen = EspressoSearchScreen()
    val catDetailsScreen = EspressoCatDetailsScreen()

    val nameCat = "Барсик"

    //Кейс 3. Успешный поиск котиков
    @Test
    fun searchCatAndCheckResult() {
        searchScreen.enterFieldName(nameCat)
        searchScreen.clickSearch()
        searchScreen.checkFirstCatInSearchResult(nameCat)
    }

    //Кейс 4. Переход из поиска котиков в детали
    @Test
    fun searchCatAndCheckTitleInDetails() {
        searchScreen.enterFieldName(nameCat)
        searchScreen.clickSearch()
        searchScreen.clickFirstCatInSearchResult()
        catDetailsScreen.checkNameInTitleCatDetails(nameCat)
    }
}