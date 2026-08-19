package com.awesomeapp.f270api

sealed class State353_8 {
    data object Loading : State353_8()
    data class Success(val data: String) : State353_8()
    data class Error(val message: String) : State353_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
