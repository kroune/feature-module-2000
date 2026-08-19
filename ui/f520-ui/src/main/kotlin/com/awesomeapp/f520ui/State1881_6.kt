package com.awesomeapp.f520ui

sealed class State1881_6 {
    data object Loading : State1881_6()
    data class Success(val data: String) : State1881_6()
    data class Error(val message: String) : State1881_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
