package com.awesomeapp.f226impl

sealed class State948_8 {
    data object Loading : State948_8()
    data class Success(val data: String) : State948_8()
    data class Error(val message: String) : State948_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
