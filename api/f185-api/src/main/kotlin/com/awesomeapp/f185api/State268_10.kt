package com.awesomeapp.f185api

sealed class State268_10 {
    data object Loading : State268_10()
    data class Success(val data: String) : State268_10()
    data class Error(val message: String) : State268_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
