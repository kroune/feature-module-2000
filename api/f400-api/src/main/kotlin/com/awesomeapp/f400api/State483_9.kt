package com.awesomeapp.f400api

sealed class State483_9 {
    data object Loading : State483_9()
    data class Success(val data: String) : State483_9()
    data class Error(val message: String) : State483_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
