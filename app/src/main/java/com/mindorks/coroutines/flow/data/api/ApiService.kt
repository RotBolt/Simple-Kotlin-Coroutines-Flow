package com.mindorks.coroutines.flow.data.api

import com.mindorks.coroutines.flow.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers():List<User>
}