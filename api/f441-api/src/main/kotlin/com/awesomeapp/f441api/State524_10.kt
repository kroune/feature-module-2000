package com.awesomeapp.f441api

sealed class State524_10 {
    data object Loading : State524_10()
    data class Success(val data: String) : State524_10()
    data class Error(val message: String) : State524_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
