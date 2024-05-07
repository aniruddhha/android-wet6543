package com.ani.unittesting

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest  {

    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkLogic() {

        onView(
            withId(R.id.editTextText)
        ).perform(
            ViewActions.typeText("abc")
        )

        onView(
            withId(R.id.button)
        ).perform(
            ViewActions.click()
        )
    }
}