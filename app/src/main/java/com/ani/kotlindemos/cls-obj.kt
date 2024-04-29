package com.ani.kotlindemos

abstract class Config {
    abstract fun connect()
}

class DbConfig( // primary
    val url :String,
    val port: Int
) : Config() {

    override fun connect() {

    }
}

class NwConfig {

    var a: Int = 0

    constructor(a : Int = 0) { // secondary
        this.a = a
    }

    fun connect() = println("Connected")

    fun disconnect(): Boolean = false

}


fun main() {

//     val cfg: Config = Config()

    val dbCfg = DbConfig(url = "abc", port = 1234)
    println(dbCfg.url)
    println(dbCfg.port)

    val nwCfg = NwConfig(67)
}