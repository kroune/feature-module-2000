package com.awesomeapp.f348api

sealed class State431_5 {
    data object Loading : State431_5()
    data class Success(val data: String) : State431_5()
    data class Error(val message: String) : State431_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
