package com.awesomeapp.f612api

sealed class State695_10 {
    data object Loading : State695_10()
    data class Success(val data: String) : State695_10()
    data class Error(val message: String) : State695_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
