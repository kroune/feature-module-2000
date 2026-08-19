package com.awesomeapp.f316api

sealed class State399_9 {
    data object Loading : State399_9()
    data class Success(val data: String) : State399_9()
    data class Error(val message: String) : State399_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
