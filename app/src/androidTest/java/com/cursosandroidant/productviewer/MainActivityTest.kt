package com.cursosandroidant.productviewer


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest//TODO- (@LargeTest) indicarle que la prueba sera grande, y puede aplicarse a nivel de clase o metodo
class MainActivityTest{
    @get:Rule//TODO - regla
    val activityRule = ActivityScenarioRule(MainActivity::class.java)//TODO- escenario

    @Test// funcion incrementar en campo de texto
    fun setNewQuantity_sum_increasesTexField(){
        onView(withId(R.id.etNewQuantity))//campo texField
            .check(matches(withText("1")))//TODO- nos posicionamos en el estado inicial 1

        onView(withId(R.id.ibSum))//campo incrementar
            .perform(click())//performa para desirle que es un evento onclick

        onView(withId(R.id.etNewQuantity))//TODO- le indicamo que al dar click nuestro texField pase a la posicion 2
            .check(matches(withText("2")))//TODO- nos posicionamos en 2

    }
}