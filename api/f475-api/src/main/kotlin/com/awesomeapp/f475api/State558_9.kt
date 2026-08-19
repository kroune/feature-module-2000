package com.awesomeapp.f475api

sealed class State558_9 {
    data object Loading : State558_9()
    data class Success(val data: String) : State558_9()
    data class Error(val message: String) : State558_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
