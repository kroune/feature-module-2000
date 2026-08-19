package com.awesomeapp.f572api

sealed class State655_7 {
    data object Loading : State655_7()
    data class Success(val data: String) : State655_7()
    data class Error(val message: String) : State655_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
