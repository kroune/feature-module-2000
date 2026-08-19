package com.awesomeapp.f563ui

sealed class State1924_6 {
    data object Loading : State1924_6()
    data class Success(val data: String) : State1924_6()
    data class Error(val message: String) : State1924_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
