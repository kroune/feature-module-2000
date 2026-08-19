package com.awesomeapp.f604ui

sealed class State1965_8 {
    data object Loading : State1965_8()
    data class Success(val data: String) : State1965_8()
    data class Error(val message: String) : State1965_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
