package com.awesomeapp.f391api

sealed class State474_9 {
    data object Loading : State474_9()
    data class Success(val data: String) : State474_9()
    data class Error(val message: String) : State474_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
