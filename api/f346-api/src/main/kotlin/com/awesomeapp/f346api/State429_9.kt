package com.awesomeapp.f346api

sealed class State429_9 {
    data object Loading : State429_9()
    data class Success(val data: String) : State429_9()
    data class Error(val message: String) : State429_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
