package com.awesomeapp.f159ui

sealed class State1520_8 {
    data object Loading : State1520_8()
    data class Success(val data: String) : State1520_8()
    data class Error(val message: String) : State1520_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
