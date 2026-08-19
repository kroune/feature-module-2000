package com.awesomeapp.f568ui

sealed class State1929_6 {
    data object Loading : State1929_6()
    data class Success(val data: String) : State1929_6()
    data class Error(val message: String) : State1929_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
