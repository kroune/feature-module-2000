package com.awesomeapp.f149api

sealed class State232_10 {
    data object Loading : State232_10()
    data class Success(val data: String) : State232_10()
    data class Error(val message: String) : State232_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
