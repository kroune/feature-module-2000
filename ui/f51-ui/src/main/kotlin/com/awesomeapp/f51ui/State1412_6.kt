package com.awesomeapp.f51ui

sealed class State1412_6 {
    data object Loading : State1412_6()
    data class Success(val data: String) : State1412_6()
    data class Error(val message: String) : State1412_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
