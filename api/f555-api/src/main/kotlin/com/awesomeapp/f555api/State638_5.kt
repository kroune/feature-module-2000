package com.awesomeapp.f555api

sealed class State638_5 {
    data object Loading : State638_5()
    data class Success(val data: String) : State638_5()
    data class Error(val message: String) : State638_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
