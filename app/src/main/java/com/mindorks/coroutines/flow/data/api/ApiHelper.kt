package com.mindorks.coroutines.flow.data.api

class ApiHelper (private val apiService: ApiService){

    suspend fun getUsers() = apiService.getUsers()
}