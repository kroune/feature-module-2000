package com.awesomeapp.f428ui

sealed class State1789_5 {
    data object Loading : State1789_5()
    data class Success(val data: String) : State1789_5()
    data class Error(val message: String) : State1789_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
