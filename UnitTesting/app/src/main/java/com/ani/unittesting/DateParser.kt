package com.ani.unittesting

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

class DateParser(
    private val dt: Date
) {

    // the date object should be considered and function should return date
    // in 01-01-2020
//    @RequiresApi(Build.VERSION_CODES.O)
    fun parseDate(format: String): String {
        return SimpleDateFormat(format, Locale.getDefault()).format(dt)
    }
}