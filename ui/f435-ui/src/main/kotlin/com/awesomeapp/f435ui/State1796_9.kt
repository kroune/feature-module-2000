package com.awesomeapp.f435ui

sealed class State1796_9 {
    data object Loading : State1796_9()
    data class Success(val data: String) : State1796_9()
    data class Error(val message: String) : State1796_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
