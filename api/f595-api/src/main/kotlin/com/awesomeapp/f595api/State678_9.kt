package com.awesomeapp.f595api

sealed class State678_9 {
    data object Loading : State678_9()
    data class Success(val data: String) : State678_9()
    data class Error(val message: String) : State678_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
