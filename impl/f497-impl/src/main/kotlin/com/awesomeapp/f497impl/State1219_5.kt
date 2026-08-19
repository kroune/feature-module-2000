package com.awesomeapp.f497impl

sealed class State1219_5 {
    data object Loading : State1219_5()
    data class Success(val data: String) : State1219_5()
    data class Error(val message: String) : State1219_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
