package com.awesomeapp.f88ui

sealed class State1449_6 {
    data object Loading : State1449_6()
    data class Success(val data: String) : State1449_6()
    data class Error(val message: String) : State1449_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
