package com.ani.unittesting

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest  {

    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkLogic() {

        /*
        * - write abc in edit text
        * - click the button okay
        * - in the edit text abc should become uppercase
        * */

        //write abc in edit text
        onView(
            withId(R.id.editTextText)
        ).perform(
            typeText("abc")
        )

        //click the button okay
        onView(
            withId(R.id.button)
        ).perform(
            click()
        )

        //in the edit text abc should become uppercase

        onView(
            withId(R.id.editTextText)
        ).check(
            matches(
                withText("ABC")
            )
        )
    }

    @Test
    fun checkIfNoText() {
        onView(
            withId(R.id.editTextText)
        ).perform(
            typeText("")
        )

        //click the button okay
        onView(
            withId(R.id.button)
        ).perform(
            click()
        )

        onView(
            withId(R.id.editTextText)
        ).check(
            matches(
                withText("")
            )
        )

    }

    @Test
    fun checkIfNumbersEntered() {
        onView(
            withId(R.id.editTextText)
        ).perform(
            typeText("123")
        )

        //click the button okay
        onView(
            withId(R.id.button)
        ).perform(
            click()
        )

        onView(
            withId(R.id.editTextText)
        ).check(
            matches(
                withText("123")
            )
        )
    }

    @Test
    fun checkIfCapsTextEntered() {
        onView(
            withId(R.id.editTextText)
        ).perform(
            typeText("AAA")
        )

        //click the button okay
        onView(
            withId(R.id.button)
        ).perform(
            click()
        )

        onView(
            withId(R.id.editTextText)
        ).check(
            matches(
                withText("AAA")
            )
        )
    }

    @Test
    fun checkIfCombinationEntered() {
        onView(
            withId(R.id.editTextText)
        ).perform(
            typeText("a11B45*")
        )

        //click the button okay
        onView(
            withId(R.id.button)
        ).perform(
            click()
        )

        onView(
            withId(R.id.editTextText)
        ).check(
            matches(
                withText("A11B45*")
            )
        )

    }
}