package com.awesomeapp.f59ui

sealed class State1420_8 {
    data object Loading : State1420_8()
    data class Success(val data: String) : State1420_8()
    data class Error(val message: String) : State1420_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
