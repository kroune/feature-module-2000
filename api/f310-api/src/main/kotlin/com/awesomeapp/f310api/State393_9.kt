package com.awesomeapp.f310api

sealed class State393_9 {
    data object Loading : State393_9()
    data class Success(val data: String) : State393_9()
    data class Error(val message: String) : State393_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
