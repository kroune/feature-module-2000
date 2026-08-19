package com.awesomeapp.f424impl

sealed class State1146_6 {
    data object Loading : State1146_6()
    data class Success(val data: String) : State1146_6()
    data class Error(val message: String) : State1146_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
