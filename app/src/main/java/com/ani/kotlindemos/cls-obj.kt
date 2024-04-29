package com.ani.kotlindemos

class Config

class DbConfig( // primary
    private var url :String,
    var port: Int
) {
    var dbUrl: String
        get() = this.url
        set(value) { this.url = value  }
}

class NwConfig {
    private var a: Int = 0
    constructor(a : Int = 0) { // secondary
        this.a = a
    }
    fun connect() = println("Connected")
    fun disconnect(): Boolean = false
}

fun main() {

    val cfg: Config = Config()

    val dbCfg = DbConfig(url = "abc", port = 1234)
    println(dbCfg.dbUrl) // getter
    dbCfg.dbUrl = "localhost"
    println(dbCfg.port)

    val nwCfg = NwConfig(67)
}