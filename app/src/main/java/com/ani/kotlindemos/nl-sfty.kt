package com.ani.kotlindemos

fun main() {

    var nn :String = "this cant be null"
//     nn = null

    var nullable: String? = "Some data"
    nullable = null

    var ln = nullable?.length
//    var ln = nullable!!.length

}