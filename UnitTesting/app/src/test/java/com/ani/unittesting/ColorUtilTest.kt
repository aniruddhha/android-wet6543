package com.ani.unittesting

import android.graphics.Color
import org.junit.Assert
import org.junit.Test

class ColorUtilTest {

    @Test
    fun checkRedColor() {
        ColorUtil.setRed()
        Assert.assertEquals("red", ColorUtil.getColor())
    }

    @Test
    fun checkGreenColor() {
        ColorUtil.setGreen()
        Assert.assertEquals("green", ColorUtil.getColor())
    }

    @Test
    fun checkBlueColor() {
        ColorUtil.setBlue()
        Assert.assertEquals("blue", ColorUtil.getColor())
    }
}