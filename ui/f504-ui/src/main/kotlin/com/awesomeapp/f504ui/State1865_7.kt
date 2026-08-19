package com.awesomeapp.f504ui

sealed class State1865_7 {
    data object Loading : State1865_7()
    data class Success(val data: String) : State1865_7()
    data class Error(val message: String) : State1865_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
