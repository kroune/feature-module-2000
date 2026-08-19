package com.awesomeapp.f512impl

sealed class State1234_8 {
    data object Loading : State1234_8()
    data class Success(val data: String) : State1234_8()
    data class Error(val message: String) : State1234_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
