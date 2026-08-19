package com.awesomeapp.f255ui

sealed class State1616_6 {
    data object Loading : State1616_6()
    data class Success(val data: String) : State1616_6()
    data class Error(val message: String) : State1616_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
