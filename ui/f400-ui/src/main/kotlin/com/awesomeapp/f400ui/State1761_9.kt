package com.awesomeapp.f400ui

sealed class State1761_9 {
    data object Loading : State1761_9()
    data class Success(val data: String) : State1761_9()
    data class Error(val message: String) : State1761_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
