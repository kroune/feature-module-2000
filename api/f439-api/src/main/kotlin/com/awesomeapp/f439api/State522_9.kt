package com.awesomeapp.f439api

sealed class State522_9 {
    data object Loading : State522_9()
    data class Success(val data: String) : State522_9()
    data class Error(val message: String) : State522_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
