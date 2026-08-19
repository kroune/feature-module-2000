package com.awesomeapp.f391ui

sealed class State1752_10 {
    data object Loading : State1752_10()
    data class Success(val data: String) : State1752_10()
    data class Error(val message: String) : State1752_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
