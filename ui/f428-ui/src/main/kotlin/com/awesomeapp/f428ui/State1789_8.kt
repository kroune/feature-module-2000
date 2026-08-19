package com.awesomeapp.f428ui

sealed class State1789_8 {
    data object Loading : State1789_8()
    data class Success(val data: String) : State1789_8()
    data class Error(val message: String) : State1789_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
