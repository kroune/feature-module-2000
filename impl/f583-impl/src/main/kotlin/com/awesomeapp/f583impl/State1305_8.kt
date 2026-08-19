package com.awesomeapp.f583impl

sealed class State1305_8 {
    data object Loading : State1305_8()
    data class Success(val data: String) : State1305_8()
    data class Error(val message: String) : State1305_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
