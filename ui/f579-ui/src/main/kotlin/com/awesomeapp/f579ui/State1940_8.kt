package com.awesomeapp.f579ui

sealed class State1940_8 {
    data object Loading : State1940_8()
    data class Success(val data: String) : State1940_8()
    data class Error(val message: String) : State1940_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
