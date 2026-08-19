package com.awesomeapp.f626api

sealed class State709_8 {
    data object Loading : State709_8()
    data class Success(val data: String) : State709_8()
    data class Error(val message: String) : State709_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
