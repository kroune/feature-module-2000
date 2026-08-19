package com.awesomeapp.f319api

sealed class State402_9 {
    data object Loading : State402_9()
    data class Success(val data: String) : State402_9()
    data class Error(val message: String) : State402_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
