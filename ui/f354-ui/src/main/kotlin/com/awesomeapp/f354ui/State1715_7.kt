package com.awesomeapp.f354ui

sealed class State1715_7 {
    data object Loading : State1715_7()
    data class Success(val data: String) : State1715_7()
    data class Error(val message: String) : State1715_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
