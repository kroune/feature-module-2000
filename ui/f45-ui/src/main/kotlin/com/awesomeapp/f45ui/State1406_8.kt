package com.awesomeapp.f45ui

sealed class State1406_8 {
    data object Loading : State1406_8()
    data class Success(val data: String) : State1406_8()
    data class Error(val message: String) : State1406_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
