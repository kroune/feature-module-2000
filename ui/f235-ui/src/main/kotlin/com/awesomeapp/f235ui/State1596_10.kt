package com.awesomeapp.f235ui

sealed class State1596_10 {
    data object Loading : State1596_10()
    data class Success(val data: String) : State1596_10()
    data class Error(val message: String) : State1596_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
