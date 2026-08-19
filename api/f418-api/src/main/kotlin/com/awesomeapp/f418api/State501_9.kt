package com.awesomeapp.f418api

sealed class State501_9 {
    data object Loading : State501_9()
    data class Success(val data: String) : State501_9()
    data class Error(val message: String) : State501_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
