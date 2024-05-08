package com.ani.bdddemo.test

import android.content.Intent

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import com.ani.bdddemo.MainActivity
import com.ani.bdddemo.R
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class LoginDetailsSteps(
    val scenario: ActivityScenarioHolder
) {

    @Given("^I am on the login screen")
    fun loginScreen() {
       scenario.launch(
           Intent(
               InstrumentationRegistry.getInstrumentation().targetContext,
               MainActivity::class.java
           )
       )
    }

    @When("^I enter email \"([^\"]*)\"$")
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