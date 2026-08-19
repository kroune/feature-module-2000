package com.awesomeapp.f184api

sealed class State267_9 {
    data object Loading : State267_9()
    data class Success(val data: String) : State267_9()
    data class Error(val message: String) : State267_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
