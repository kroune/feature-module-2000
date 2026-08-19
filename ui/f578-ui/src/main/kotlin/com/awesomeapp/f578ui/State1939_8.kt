package com.awesomeapp.f578ui

sealed class State1939_8 {
    data object Loading : State1939_8()
    data class Success(val data: String) : State1939_8()
    data class Error(val message: String) : State1939_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
