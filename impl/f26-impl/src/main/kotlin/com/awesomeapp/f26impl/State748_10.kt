package com.awesomeapp.f26impl

sealed class State748_10 {
    data object Loading : State748_10()
    data class Success(val data: String) : State748_10()
    data class Error(val message: String) : State748_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
