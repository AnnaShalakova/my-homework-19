package ru.tinkoff.fintech.meowle.meowle.espresso
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.tinkoff.fintech.meowle.meowle.screens.espresso.EspressoAddScreen
import ru.tinkoff.fintech.meowle.presentation.MainActivity
import ru.tinkoff.fintech.meowle.screens.uiautomator.NavigationBarElements


@RunWith(AndroidJUnit4::class)
class EspressoAddTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    val navigationBar = NavigationBarElements()
    val addScreen = EspressoAddScreen()

    val nameCat = "НовыйКот"

    //Кейс 5. Успешное добавление котика
    @Test
    fun addCatAndCheckResult() {
        navigationBar.clickAdd()

        addScreen.enterName(nameCat)
        addScreen.clickAddButton()
        //к сожалению так и не смогла найти как обратиться к тосту с текстом "Котик добавлен"((((
    }
}