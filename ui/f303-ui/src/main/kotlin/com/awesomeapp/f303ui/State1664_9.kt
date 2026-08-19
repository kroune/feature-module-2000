package com.awesomeapp.f303ui

sealed class State1664_9 {
    data object Loading : State1664_9()
    data class Success(val data: String) : State1664_9()
    data class Error(val message: String) : State1664_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
