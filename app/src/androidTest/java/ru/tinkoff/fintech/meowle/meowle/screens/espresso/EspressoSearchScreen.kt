package ru.tinkoff.fintech.meowle.screens.espresso

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import ru.tinkoff.fintech.meowle.R

class EspressoSearchScreen {

    private val searchTitle = onView(withId(R.id.tw_search_title))
    private val searchFieldName = onView(withId(R.id.et_search))
    private val searchButton = onView(withId(R.id.search_button))
    private val searchResult = onView(withId(R.id.rv_search_result_list))

    //проверка заголовка
    fun checkTitle(titleText: String) {
        searchTitle.check(matches(withText(titleText)))
    }

    //ввод имени
    fun enterFieldName(fieldName: String) {
        searchFieldName.perform(ViewActions.replaceText(fieldName))
    }

    //клик по кнопке поиска
    fun clickSearch() {
        searchButton.perform(ViewActions.click())
    }

    //проверка имени в списке результатов поиска
    fun checkFirstCatInSearchResult(nameCat: String) {
        searchResult.perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.scrollTo())).check(matches(hasDescendant(withText(nameCat))));
    }

    //клик по первому котику в результатах поиска
    fun clickFirstCatInSearchResult() {
        searchResult.perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.click()))
    }
}