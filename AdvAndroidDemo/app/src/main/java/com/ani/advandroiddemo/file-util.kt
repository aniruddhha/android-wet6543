package com.ani.advandroiddemo

data class Car(
    var id: String,
    var speed: Int
) {
    fun speedUp() = speed + 10
}
// let, run, with, apply, also
fun letSendData(car : Car?) {
    car?.let {
        println(it)
        it.toString()
        it.speedUp()
        println(it)
    }

    println(car)

    // connecting to server
    // rest api
}

fun runSendData(car : Car?) {
    var cr = car?.run {
        id = "aa"
    }
    println(cr)
}

fun withSendData(car : Car) {
    with(car) {
        id = "90"
        speed = 90
    }
}

fun applySendData(car : Car?) {
    var cr = car?.apply {
        speed = 90
        id ="89798"
    }
    println(cr)
}

fun alsoSendData(car : Car?) {
    var cr = car.also {
        println(it)
    }
}
