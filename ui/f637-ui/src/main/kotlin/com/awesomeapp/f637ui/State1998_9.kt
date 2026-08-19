package com.awesomeapp.f637ui

sealed class State1998_9 {
    data object Loading : State1998_9()
    data class Success(val data: String) : State1998_9()
    data class Error(val message: String) : State1998_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
