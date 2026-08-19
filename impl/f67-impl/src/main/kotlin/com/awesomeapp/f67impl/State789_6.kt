package com.awesomeapp.f67impl

sealed class State789_6 {
    data object Loading : State789_6()
    data class Success(val data: String) : State789_6()
    data class Error(val message: String) : State789_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
