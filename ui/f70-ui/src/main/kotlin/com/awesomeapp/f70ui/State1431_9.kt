package com.awesomeapp.f70ui

sealed class State1431_9 {
    data object Loading : State1431_9()
    data class Success(val data: String) : State1431_9()
    data class Error(val message: String) : State1431_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
