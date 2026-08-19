package com.awesomeapp.f448api

sealed class State531_9 {
    data object Loading : State531_9()
    data class Success(val data: String) : State531_9()
    data class Error(val message: String) : State531_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
