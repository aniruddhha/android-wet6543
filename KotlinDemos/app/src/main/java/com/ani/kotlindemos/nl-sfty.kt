package com.ani.kotlindemos

fun main() {

    var nn :String = "this cant be null"
//     nn = null

    var nullable: String? = "Some data"
    nullable = null

    var ln = nullable?.length
//    var ln = nullable!!.length

    var ln1 = if (nullable != null) nullable.length else -1
    println(ln1)

    var ln2 = nullable?.length ?: -1 // Elvis operator
    println(ln2)

        // ?: Elvis
        // !! Null Asserted -> NPE
       //  ?  Null Safety
}