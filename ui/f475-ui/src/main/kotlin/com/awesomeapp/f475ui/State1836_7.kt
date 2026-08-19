package com.awesomeapp.f475ui

sealed class State1836_7 {
    data object Loading : State1836_7()
    data class Success(val data: String) : State1836_7()
    data class Error(val message: String) : State1836_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
