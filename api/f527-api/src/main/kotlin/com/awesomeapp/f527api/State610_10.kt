package com.awesomeapp.f527api

sealed class State610_10 {
    data object Loading : State610_10()
    data class Success(val data: String) : State610_10()
    data class Error(val message: String) : State610_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
