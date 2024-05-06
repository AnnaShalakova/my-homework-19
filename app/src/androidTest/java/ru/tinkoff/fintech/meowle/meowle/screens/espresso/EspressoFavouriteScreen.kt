package ru.tinkoff.fintech.meowle.meowle.screens.espresso

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import ru.tinkoff.fintech.meowle.R


class EspressoFavouriteScreen {

    private val cellCatInFavourite = onView(withId(R.id.rv_cats_list))

    //клик по первому котику
    fun clickTopCatInRatingList() {
        cellCatInFavourite.perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.click()))
    }
}