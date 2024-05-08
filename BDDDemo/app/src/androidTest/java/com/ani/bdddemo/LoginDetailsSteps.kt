package com.ani.bdddemo

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.runner.RunWith

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import io.cucumber.core.cli.Main
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class LoginDetailsSteps {

    lateinit var  scenario : ActivityScenario<MainActivity>;

    @When("I am on the login screen")
    fun loginScreen() {
        scenario  = ActivityScenario.launch<MainActivity>(
            Intent(
                InstrumentationRegistry.getInstrumentation().context,
                MainActivity::class.java
            )
        )
    }

    @When("I enter email \"([^\"]*)\"$")
    fun enterEmail(email: String) {
        onView(withId(R.id.editTextText)).perform(typeText(email))
    }

    @When("I enter password \"([^\"]*)\"$")
    fun enterPassword(password: String) {
        onView(withId(R.id.editTextText2)).perform(typeText(password))
        closeSoftKeyboard()
    }

    @When("I tap the login button")
    fun onTapLoginButton() {
        onView(withId(R.id.button)).perform(click())
    }

    @Then("I should see status \"([^\"]*)\"\$")
    fun onSuccess(sts : String) {
        onView(withId(R.id.textView)).check(
            matches(
                withText(sts)
            )
        )
    }
}