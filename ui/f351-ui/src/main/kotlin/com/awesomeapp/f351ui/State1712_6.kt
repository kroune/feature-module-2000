package com.awesomeapp.f351ui

sealed class State1712_6 {
    data object Loading : State1712_6()
    data class Success(val data: String) : State1712_6()
    data class Error(val message: String) : State1712_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
