package com.awesomeapp.f437ui

sealed class State1798_8 {
    data object Loading : State1798_8()
    data class Success(val data: String) : State1798_8()
    data class Error(val message: String) : State1798_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
