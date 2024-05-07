package com.ani.unittesting

import org.junit.Test
import java.time.LocalDate

class DateParserTest {

    @Test
    fun checkWorking() {
        val dp = DateParser(LocalDate.now())
        val str = dp.parseDate()
    }
}