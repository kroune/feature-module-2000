package com.awesomeapp.f473api

sealed class State556_7 {
    data object Loading : State556_7()
    data class Success(val data: String) : State556_7()
    data class Error(val message: String) : State556_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
