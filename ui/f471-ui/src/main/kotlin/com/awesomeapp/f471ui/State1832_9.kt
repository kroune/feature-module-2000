package com.awesomeapp.f471ui

sealed class State1832_9 {
    data object Loading : State1832_9()
    data class Success(val data: String) : State1832_9()
    data class Error(val message: String) : State1832_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
