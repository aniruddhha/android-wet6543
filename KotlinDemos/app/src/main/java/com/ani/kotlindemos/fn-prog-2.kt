package com.ani.kotlindemos

fun dial(num : String) {
    println("Calling to $num")
}

// 2. functions are passed as parameter to other functions
fun update(fn : () -> Unit) {

}

fun main() {
    dial("646465")

    update(fun() {  })
    update({  })
    update {  }
}

