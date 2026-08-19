package com.awesomeapp.f271api

sealed class State354_9 {
    data object Loading : State354_9()
    data class Success(val data: String) : State354_9()
    data class Error(val message: String) : State354_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
