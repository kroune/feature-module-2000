package com.awesomeapp.f380api

sealed class State463_5 {
    data object Loading : State463_5()
    data class Success(val data: String) : State463_5()
    data class Error(val message: String) : State463_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
