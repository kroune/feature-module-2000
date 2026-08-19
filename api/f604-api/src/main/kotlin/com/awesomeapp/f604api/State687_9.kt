package com.awesomeapp.f604api

sealed class State687_9 {
    data object Loading : State687_9()
    data class Success(val data: String) : State687_9()
    data class Error(val message: String) : State687_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
