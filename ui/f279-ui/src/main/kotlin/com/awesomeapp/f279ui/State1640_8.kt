package com.awesomeapp.f279ui

sealed class State1640_8 {
    data object Loading : State1640_8()
    data class Success(val data: String) : State1640_8()
    data class Error(val message: String) : State1640_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
