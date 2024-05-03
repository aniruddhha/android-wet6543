package com.ani.fragmentdemos

import retrofit2.Response
import retrofit2.http.GET
data class App (
    var id: String,
    var cnt: Int
)
interface AppCrud {
    @GET("/simple/app")
    fun apps() : Response<List<App>>
}