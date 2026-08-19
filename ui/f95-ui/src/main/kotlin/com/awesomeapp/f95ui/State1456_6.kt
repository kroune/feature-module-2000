package com.awesomeapp.f95ui

sealed class State1456_6 {
    data object Loading : State1456_6()
    data class Success(val data: String) : State1456_6()
    data class Error(val message: String) : State1456_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
