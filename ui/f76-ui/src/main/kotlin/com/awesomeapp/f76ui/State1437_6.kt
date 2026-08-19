package com.awesomeapp.f76ui

sealed class State1437_6 {
    data object Loading : State1437_6()
    data class Success(val data: String) : State1437_6()
    data class Error(val message: String) : State1437_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
