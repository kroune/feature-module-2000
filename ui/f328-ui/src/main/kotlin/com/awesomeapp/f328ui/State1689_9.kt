package com.awesomeapp.f328ui

sealed class State1689_9 {
    data object Loading : State1689_9()
    data class Success(val data: String) : State1689_9()
    data class Error(val message: String) : State1689_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
