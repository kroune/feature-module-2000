package com.awesomeapp.f235ui

sealed class State1596_7 {
    data object Loading : State1596_7()
    data class Success(val data: String) : State1596_7()
    data class Error(val message: String) : State1596_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
