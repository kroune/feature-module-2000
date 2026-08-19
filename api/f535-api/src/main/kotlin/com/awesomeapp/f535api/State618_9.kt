package com.awesomeapp.f535api

sealed class State618_9 {
    data object Loading : State618_9()
    data class Success(val data: String) : State618_9()
    data class Error(val message: String) : State618_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
