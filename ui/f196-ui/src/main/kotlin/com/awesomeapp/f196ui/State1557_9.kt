package com.awesomeapp.f196ui

sealed class State1557_9 {
    data object Loading : State1557_9()
    data class Success(val data: String) : State1557_9()
    data class Error(val message: String) : State1557_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
