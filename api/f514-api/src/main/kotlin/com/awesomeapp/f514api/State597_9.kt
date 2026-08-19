package com.awesomeapp.f514api

sealed class State597_9 {
    data object Loading : State597_9()
    data class Success(val data: String) : State597_9()
    data class Error(val message: String) : State597_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
