package com.mindorks.coroutines.flow.data.repository

import com.mindorks.coroutines.flow.data.api.ApiHelper
import com.mindorks.coroutines.flow.data.model.User

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers(): List<User> = apiHelper.getUsers()

}