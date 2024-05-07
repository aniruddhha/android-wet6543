package com.ani.unittesting

import android.graphics.Color
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Assert

@RunWith(AndroidJUnit4::class)
class CheckActivityInstrumentedTest {

    @get:Rule
    val actRule = ActivityScenarioRule(CheckActivity::class.java)

    @Test
    fun check_getIntColor_method() {

        actRule.scenario.onActivity {
            ColorUtil.setBlue()
            val col = it.getIntColor()
            Assert.assertEquals(Color.BLUE, col)
        }
    }

    @Test
    fun check_red_check_box_working() {

    }
}