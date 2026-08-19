package com.awesomeapp.f203ui

sealed class State1564_9 {
    data object Loading : State1564_9()
    data class Success(val data: String) : State1564_9()
    data class Error(val message: String) : State1564_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
