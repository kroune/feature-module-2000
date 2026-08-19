package com.awesomeapp.f252api

sealed class State335_10 {
    data object Loading : State335_10()
    data class Success(val data: String) : State335_10()
    data class Error(val message: String) : State335_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
