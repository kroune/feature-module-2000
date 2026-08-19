package com.awesomeapp.f364api

sealed class State447_9 {
    data object Loading : State447_9()
    data class Success(val data: String) : State447_9()
    data class Error(val message: String) : State447_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
