package com.awesomeapp.f301impl

sealed class State1023_6 {
    data object Loading : State1023_6()
    data class Success(val data: String) : State1023_6()
    data class Error(val message: String) : State1023_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
