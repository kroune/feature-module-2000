package com.awesomeapp.f299api

sealed class State382_5 {
    data object Loading : State382_5()
    data class Success(val data: String) : State382_5()
    data class Error(val message: String) : State382_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
