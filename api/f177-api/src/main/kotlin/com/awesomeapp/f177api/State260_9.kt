package com.awesomeapp.f177api

sealed class State260_9 {
    data object Loading : State260_9()
    data class Success(val data: String) : State260_9()
    data class Error(val message: String) : State260_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
