package com.ani.kotlindemos

fun ifElse() {
    val day = 3
    val nm = if(day == 0) "Mon"
    else if ( day == 1) "Tue"
    else "Sun"
    println(nm)
}
fun main() {
    val day = 3

    val nm = when(day) {
        0 -> "Mon"
        1 -> "Tue"
        else -> "Sun"
    }
    println(nm)
}