package com.awesomeapp.f361api

sealed class State444_8 {
    data object Loading : State444_8()
    data class Success(val data: String) : State444_8()
    data class Error(val message: String) : State444_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
