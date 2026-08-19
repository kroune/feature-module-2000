package com.awesomeapp.f424api

sealed class State507_9 {
    data object Loading : State507_9()
    data class Success(val data: String) : State507_9()
    data class Error(val message: String) : State507_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
