package com.awesomeapp.f498api

sealed class State581_5 {
    data object Loading : State581_5()
    data class Success(val data: String) : State581_5()
    data class Error(val message: String) : State581_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
