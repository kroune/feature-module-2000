package com.awesomeapp.f404ui

sealed class State1765_7 {
    data object Loading : State1765_7()
    data class Success(val data: String) : State1765_7()
    data class Error(val message: String) : State1765_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
