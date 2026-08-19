package com.awesomeapp.f73impl

sealed class State795_8 {
    data object Loading : State795_8()
    data class Success(val data: String) : State795_8()
    data class Error(val message: String) : State795_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
