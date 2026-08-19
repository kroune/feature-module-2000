package com.awesomeapp.f138ui

sealed class State1499_8 {
    data object Loading : State1499_8()
    data class Success(val data: String) : State1499_8()
    data class Error(val message: String) : State1499_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
