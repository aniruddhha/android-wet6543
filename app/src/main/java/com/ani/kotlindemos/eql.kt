package com.ani.kotlindemos

import java.lang.StringBuilder

fun main() {

    val st1 = StringBuilder("abc").toString()
    val st2 = StringBuilder("abc").toString()
    println(st1 == st2) // content
    println(st1 === st2) // references
}