package com.ani.kotlindemos

// 3. functions can be returned from another function

fun calc(a : Int, b: Int): Int = a + b

fun operation1( ): () -> Unit {
    return fun() {

    }
}
fun operation2( ): () -> Unit {
    return {  }
}

fun operation3(): () -> Unit = {

}