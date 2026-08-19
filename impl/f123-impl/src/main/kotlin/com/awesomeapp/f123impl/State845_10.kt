package com.awesomeapp.f123impl

sealed class State845_10 {
    data object Loading : State845_10()
    data class Success(val data: String) : State845_10()
    data class Error(val message: String) : State845_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
