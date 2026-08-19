package com.awesomeapp.f241ui

sealed class State1602_9 {
    data object Loading : State1602_9()
    data class Success(val data: String) : State1602_9()
    data class Error(val message: String) : State1602_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
