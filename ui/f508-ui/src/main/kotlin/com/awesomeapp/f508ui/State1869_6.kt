package com.awesomeapp.f508ui

sealed class State1869_6 {
    data object Loading : State1869_6()
    data class Success(val data: String) : State1869_6()
    data class Error(val message: String) : State1869_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
