package com.ani.kotlindemos

import java.lang.StringBuilder

fun main() {

    val st1: String? = StringBuilder("abc").toString()
    val st2: String? = StringBuilder("abc").toString()
    println(st1 == st2) // content
    println(st1 === st2) // references
}