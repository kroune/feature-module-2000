package com.awesomeapp.f340api

sealed class State423_9 {
    data object Loading : State423_9()
    data class Success(val data: String) : State423_9()
    data class Error(val message: String) : State423_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
