package com.awesomeapp.f331api

sealed class State414_9 {
    data object Loading : State414_9()
    data class Success(val data: String) : State414_9()
    data class Error(val message: String) : State414_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
