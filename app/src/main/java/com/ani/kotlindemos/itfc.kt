package com.ani.kotlindemos

interface Connectable {

    fun connect()
}

interface Disposable

open class BaseConfig

class Config1 : BaseConfig(), Connectable, Disposable {

    override fun connect() {
        println("Connected to Database")
    }

}


fun main() {

    val cfg = Config1()
    cfg.connect()

    val cfg2: Connectable = object : Connectable {
        override fun connect() {
            println("Connected to Network")
        }
    }
    cfg2.connect()
}