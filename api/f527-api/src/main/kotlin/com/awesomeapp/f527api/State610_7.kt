package com.awesomeapp.f527api

sealed class State610_7 {
    data object Loading : State610_7()
    data class Success(val data: String) : State610_7()
    data class Error(val message: String) : State610_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
