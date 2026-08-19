package com.awesomeapp.f350impl

sealed class State1072_6 {
    data object Loading : State1072_6()
    data class Success(val data: String) : State1072_6()
    data class Error(val message: String) : State1072_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
