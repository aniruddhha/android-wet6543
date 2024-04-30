package com.ani.kotlindemos

fun main() {

    val cfg = object {
        var url: String = "localhost"
        var port:Int = 1234

        fun connect() {
            println("Connected to URL ${url}")
        }
    }

    println("URL ${cfg.url}")
    println("PORT ${cfg.port}")
    cfg.connect()

}