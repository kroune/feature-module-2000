package com.awesomeapp.f11ui

sealed class State1372_9 {
    data object Loading : State1372_9()
    data class Success(val data: String) : State1372_9()
    data class Error(val message: String) : State1372_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
