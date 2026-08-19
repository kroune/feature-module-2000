package com.awesomeapp.f26impl

sealed class State748_7 {
    data object Loading : State748_7()
    data class Success(val data: String) : State748_7()
    data class Error(val message: String) : State748_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
