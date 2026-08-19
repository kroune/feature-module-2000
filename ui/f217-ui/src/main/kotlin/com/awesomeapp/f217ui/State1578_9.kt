package com.awesomeapp.f217ui

sealed class State1578_9 {
    data object Loading : State1578_9()
    data class Success(val data: String) : State1578_9()
    data class Error(val message: String) : State1578_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
