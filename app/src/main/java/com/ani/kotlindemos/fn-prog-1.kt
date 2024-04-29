package com.ani.kotlindemos

val a :Int = 10

// 1. functions are assigned to variables
val fn1 :() -> Unit = fun () { }

val fn2 :(b : Boolean) -> Unit = { b : Boolean -> println(b)}

val fn3 :(b : Boolean) -> Unit = { b -> println(b) }

val fn4 = { b: Boolean -> println(b) }

val fn5 :(b : Boolean) -> Unit = { println(it) }

