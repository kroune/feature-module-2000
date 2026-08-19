package com.awesomeapp.f616ui

sealed class State1977_6 {
    data object Loading : State1977_6()
    data class Success(val data: String) : State1977_6()
    data class Error(val message: String) : State1977_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
