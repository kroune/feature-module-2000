package com.awesomeapp.f463api

sealed class State546_9 {
    data object Loading : State546_9()
    data class Success(val data: String) : State546_9()
    data class Error(val message: String) : State546_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
