package com.ani.kotlindemos

import java.time.LocalDate

data class Car (
    var cost: Double,
    var make: String,
    var mfg: LocalDate
)

fun main() {

    val cr = Car(23.8, "Abc", LocalDate.now())
    println(cr)

}