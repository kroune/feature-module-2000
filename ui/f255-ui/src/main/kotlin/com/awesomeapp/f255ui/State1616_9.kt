package com.awesomeapp.f255ui

sealed class State1616_9 {
    data object Loading : State1616_9()
    data class Success(val data: String) : State1616_9()
    data class Error(val message: String) : State1616_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
