package com.awesomeapp.f456ui

sealed class State1817_5 {
    data object Loading : State1817_5()
    data class Success(val data: String) : State1817_5()
    data class Error(val message: String) : State1817_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
