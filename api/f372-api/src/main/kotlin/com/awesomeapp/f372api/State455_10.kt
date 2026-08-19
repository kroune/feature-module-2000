package com.awesomeapp.f372api

sealed class State455_10 {
    data object Loading : State455_10()
    data class Success(val data: String) : State455_10()
    data class Error(val message: String) : State455_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
