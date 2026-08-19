package com.awesomeapp.f302impl

sealed class State1024_6 {
    data object Loading : State1024_6()
    data class Success(val data: String) : State1024_6()
    data class Error(val message: String) : State1024_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
