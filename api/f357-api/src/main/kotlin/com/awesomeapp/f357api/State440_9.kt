package com.awesomeapp.f357api

sealed class State440_9 {
    data object Loading : State440_9()
    data class Success(val data: String) : State440_9()
    data class Error(val message: String) : State440_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
