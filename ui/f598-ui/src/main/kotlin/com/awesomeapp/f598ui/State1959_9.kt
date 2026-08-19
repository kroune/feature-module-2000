package com.awesomeapp.f598ui

sealed class State1959_9 {
    data object Loading : State1959_9()
    data class Success(val data: String) : State1959_9()
    data class Error(val message: String) : State1959_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
