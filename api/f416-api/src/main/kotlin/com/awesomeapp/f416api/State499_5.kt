package com.awesomeapp.f416api

sealed class State499_5 {
    data object Loading : State499_5()
    data class Success(val data: String) : State499_5()
    data class Error(val message: String) : State499_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
