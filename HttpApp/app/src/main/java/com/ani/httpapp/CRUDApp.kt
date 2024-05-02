package com.ani.httpapp

import retrofit2.Response
import retrofit2.http.GET

interface CRUDApp {
    @GET("/simple")
    suspend fun sakjkajsfhkjashfbd(): Response<App>
}