package com.mindorks.coroutines.flow.ui.main.viewmodel

import android.view.ViewManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mindorks.coroutines.flow.data.model.User
import com.mindorks.coroutines.flow.data.repository.MainRepository
import com.mindorks.coroutines.flow.utils.Resource
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    private val users = MutableLiveData<Resource<List<User>>>()

    init {
        fetchUsers()
    }

    fun fetchUsers() {
        viewModelScope.launch {
            users.postValue(Resource.loading(null))
            try {
                users.postValue(Resource.success(mainRepository.getUsers()))
            } catch (e: Exception) {
                users.postValue(Resource.error(null, "Something went wrong"))
            }
        }
    }

    fun getUsers(): LiveData<Resource<List<User>>> = users

}