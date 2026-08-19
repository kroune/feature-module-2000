package com.awesomeapp.f413api

sealed class State496_10 {
    data object Loading : State496_10()
    data class Success(val data: String) : State496_10()
    data class Error(val message: String) : State496_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
