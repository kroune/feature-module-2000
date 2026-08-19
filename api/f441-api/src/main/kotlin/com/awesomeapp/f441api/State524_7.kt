package com.awesomeapp.f441api

sealed class State524_7 {
    data object Loading : State524_7()
    data class Success(val data: String) : State524_7()
    data class Error(val message: String) : State524_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
