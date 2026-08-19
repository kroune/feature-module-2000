package com.awesomeapp.f416api

sealed class State499_8 {
    data object Loading : State499_8()
    data class Success(val data: String) : State499_8()
    data class Error(val message: String) : State499_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
