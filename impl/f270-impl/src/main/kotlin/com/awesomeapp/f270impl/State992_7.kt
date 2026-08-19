package com.awesomeapp.f270impl

sealed class State992_7 {
    data object Loading : State992_7()
    data class Success(val data: String) : State992_7()
    data class Error(val message: String) : State992_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
