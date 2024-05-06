package ru.tinkoff.fintech.meowle.meowle.screens.espresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import ru.tinkoff.fintech.meowle.R

class EspressoCatDetailsScreen {

    private val favouriteButton = onView(withId(R.id.ib_favorite))
    private val likeCount = onView(withId(R.id.cat_likes))
    private val likeButton = onView(withId(R.id.ib_like))

    //проверка имени кота в заголовке
    fun checkNameInTitleCatDetails(nameCat: String) {
        onView(withId(R.id.tw_details_title))
            .check(matches(withText("Досье по $nameCat")))
    }

    //клик добавить в избранное
    fun clickAddToFavourite() {
        favouriteButton.perform(ViewActions.click())
    }

    //клик поставить лайк
    fun clickLike() {
        likeButton.perform(ViewActions.click())
    }
}