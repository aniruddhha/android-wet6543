package com.ani.unittesting

object ColorUtil {

    private var color = "black"

    fun setRed()  {
        color = "red"
    }

    fun setGreen() {
        color = "green"
    }

    fun setBlue() {
        color = "blue"
    }

    fun reset() {
        color = "white"
    }

    fun getColor() = color
}