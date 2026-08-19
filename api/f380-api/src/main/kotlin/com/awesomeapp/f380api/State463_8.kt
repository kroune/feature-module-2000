package com.awesomeapp.f380api

sealed class State463_8 {
    data object Loading : State463_8()
    data class Success(val data: String) : State463_8()
    data class Error(val message: String) : State463_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
