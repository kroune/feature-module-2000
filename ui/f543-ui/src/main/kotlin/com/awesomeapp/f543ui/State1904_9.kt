package com.awesomeapp.f543ui

sealed class State1904_9 {
    data object Loading : State1904_9()
    data class Success(val data: String) : State1904_9()
    data class Error(val message: String) : State1904_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
