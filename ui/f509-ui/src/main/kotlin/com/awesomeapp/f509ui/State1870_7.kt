package com.awesomeapp.f509ui

sealed class State1870_7 {
    data object Loading : State1870_7()
    data class Success(val data: String) : State1870_7()
    data class Error(val message: String) : State1870_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
