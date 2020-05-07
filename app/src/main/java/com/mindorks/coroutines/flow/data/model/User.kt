package com.mindorks.coroutines.flow.data.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id:Int = 0,

    @SerializedName("name")
    val name:String = "",

    @SerializedName("avatar")
    val avatar:String = "",

    @SerializedName("email")
    val email:String = "",

    @SerializedName("isFollowing")
    var isFollowing:Boolean = false
)