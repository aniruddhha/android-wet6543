package com.ani.unittesting

import org.junit.Assert
import org.junit.Test

class InternetUtilTest {

    @Test
    fun checkReturnType() {
        Assert.assertTrue(isWifiAvailable("abc"))
    }

    @Test
    fun shouldAcceptString() {
        Assert.assertFalse(isWifiAvailable(null))
    }

    @Test
    fun checkEmptySSID() {
        val ssid = ""
        Assert.assertFalse(isWifiAvailable(ssid))
    }

    @Test
    fun checkBlankSSID() {
        val ssid = "        "
        Assert.assertFalse(isWifiAvailable(ssid))
    }
}