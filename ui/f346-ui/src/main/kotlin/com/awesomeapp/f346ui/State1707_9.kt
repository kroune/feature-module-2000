package com.awesomeapp.f346ui

sealed class State1707_9 {
    data object Loading : State1707_9()
    data class Success(val data: String) : State1707_9()
    data class Error(val message: String) : State1707_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
