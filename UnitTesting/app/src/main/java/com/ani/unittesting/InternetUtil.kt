package com.ani.unittesting

fun isWifiAvailable(ssid : String?) : Boolean {

    if(ssid == null) return false

    if(ssid.isEmpty()) return false

    if(ssid.isBlank()) return false

    // here your actual code for wifi to be written

    return true
}
