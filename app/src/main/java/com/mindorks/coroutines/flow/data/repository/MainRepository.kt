package com.mindorks.coroutines.flow.data.repository

import com.mindorks.coroutines.flow.data.api.ApiHelper
import com.mindorks.coroutines.flow.data.model.User
import kotlinx.coroutines.flow.Flow

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers(): Flow<List<User>> {
        return apiHelper.getUsers()
    }

}