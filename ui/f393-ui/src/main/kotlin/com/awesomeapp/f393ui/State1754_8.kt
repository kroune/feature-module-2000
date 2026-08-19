package com.awesomeapp.f393ui

sealed class State1754_8 {
    data object Loading : State1754_8()
    data class Success(val data: String) : State1754_8()
    data class Error(val message: String) : State1754_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
