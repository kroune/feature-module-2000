package com.awesomeapp.f603ui

sealed class State1964_9 {
    data object Loading : State1964_9()
    data class Success(val data: String) : State1964_9()
    data class Error(val message: String) : State1964_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
