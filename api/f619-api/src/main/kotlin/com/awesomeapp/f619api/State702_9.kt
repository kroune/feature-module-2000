package com.awesomeapp.f619api

sealed class State702_9 {
    data object Loading : State702_9()
    data class Success(val data: String) : State702_9()
    data class Error(val message: String) : State702_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
