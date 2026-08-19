package com.awesomeapp.f598api

sealed class State681_9 {
    data object Loading : State681_9()
    data class Success(val data: String) : State681_9()
    data class Error(val message: String) : State681_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
