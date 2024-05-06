package ru.tinkoff.fintech.meowle.meowle.screens.espresso

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import ru.tinkoff.fintech.meowle.R

class EspressoAddScreen {

    private val addCatAvatar = Espresso.onView(ViewMatchers.withId(R.id.iw_add_cat_avatar))
    private val addFieldEtName = Espresso.onView(ViewMatchers.withId(R.id.et_name))
    private val addButton = Espresso.onView(ViewMatchers.withId(R.id.btn_add))

    //ввод имени
    fun enterName(name: String) {
        addFieldEtName.perform(ViewActions.replaceText(name))
    }

    //клик по кнопке добавить
    fun clickAddButton() {
        addButton.perform(ViewActions.click())
    }
}