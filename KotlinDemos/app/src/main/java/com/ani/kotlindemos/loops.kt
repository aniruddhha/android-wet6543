package com.ani.kotlindemos

fun forVariations() {
    for (i in 0..5) {
        println(i)
    }

    for (i in 0 until 5) {
        println(i)
    }

    for (i in 0..5 step 2) {
        println(i)
    }

    for (i in 5 downTo 0) {
        println(i)
    }

    for (c in 'a'.. 'g') {
        println(c)
    }

    // while and do - while are exactly same
}

fun main() {

   forVariations()
}