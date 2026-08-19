package com.awesomeapp.f225ui

sealed class State1586_8 {
    data object Loading : State1586_8()
    data class Success(val data: String) : State1586_8()
    data class Error(val message: String) : State1586_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
