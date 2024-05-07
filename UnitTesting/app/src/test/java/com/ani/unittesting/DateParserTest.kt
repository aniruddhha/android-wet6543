package com.ani.unittesting

import org.junit.Assert
import org.junit.Test
import java.time.LocalDate
import java.util.Date

class DateParserTest {

    @Test
    fun checkWorking() {
        val dp = DateParser(Date())
        val str = dp.parseDate("dd-MM-yyyy")
        Assert.assertEquals("07-05-2024", str)
    }

    @Test
    fun checkWrongFormat() {
        val dp = DateParser(Date())
        val str = dp.parseDate("dd-MM-yyyy")
        Assert.assertEquals("2024-05-07", str)
    }
}