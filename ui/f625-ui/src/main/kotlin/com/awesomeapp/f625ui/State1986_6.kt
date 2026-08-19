package com.awesomeapp.f625ui

sealed class State1986_6 {
    data object Loading : State1986_6()
    data class Success(val data: String) : State1986_6()
    data class Error(val message: String) : State1986_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
