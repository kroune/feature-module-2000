package com.awesomeapp.f160ui

sealed class State1521_9 {
    data object Loading : State1521_9()
    data class Success(val data: String) : State1521_9()
    data class Error(val message: String) : State1521_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
