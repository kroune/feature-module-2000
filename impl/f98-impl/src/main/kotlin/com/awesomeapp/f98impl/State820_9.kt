package com.awesomeapp.f98impl

sealed class State820_9 {
    data object Loading : State820_9()
    data class Success(val data: String) : State820_9()
    data class Error(val message: String) : State820_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
