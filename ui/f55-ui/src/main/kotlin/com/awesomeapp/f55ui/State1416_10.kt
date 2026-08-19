package com.awesomeapp.f55ui

sealed class State1416_10 {
    data object Loading : State1416_10()
    data class Success(val data: String) : State1416_10()
    data class Error(val message: String) : State1416_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
