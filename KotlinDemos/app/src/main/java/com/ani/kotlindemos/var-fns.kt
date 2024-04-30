package com.ani.kotlindemos

fun sayHi() : Unit {
    println("Hey Hi")
}

fun sqr(n : Int) = n * n // inline function

fun printNames(nm : String, ad: String) : Boolean {

    println("Name ${nm}, Address ${ad}")
    return true
}

fun variableBasics() {
    val a = 10
    println("A = " + a)
    println("A = ${a}")

    val b: Int = 20
    val nm : String = "abc"
    val ch: Char = 'c'
    val isOkay: Boolean = true
    val sal: Double = 56.89

}

fun dbConfig(url: String = "localhost", port: Int = 3434) {
    println("Url = ${url}, Port ${port}")
}


fun main() {


//     sayHi()

//     println(sqr(10))

//     printNames("abc", "pqr")
//     printNames(ad = "abc", nm = "pqr")

    dbConfig()
    dbConfig(port = 9090, url = "192.168.0.0")
    dbConfig(port = 9090)
}