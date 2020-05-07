package com.mindorks.coroutines.flow.data.api

import kotlinx.coroutines.flow.flow

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = flow {
        emit(apiService.getUsers())
    }
}