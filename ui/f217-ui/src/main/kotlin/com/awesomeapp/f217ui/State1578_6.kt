package com.awesomeapp.f217ui

sealed class State1578_6 {
    data object Loading : State1578_6()
    data class Success(val data: String) : State1578_6()
    data class Error(val message: String) : State1578_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
