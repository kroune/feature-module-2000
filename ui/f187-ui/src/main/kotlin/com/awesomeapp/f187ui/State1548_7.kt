package com.awesomeapp.f187ui

sealed class State1548_7 {
    data object Loading : State1548_7()
    data class Success(val data: String) : State1548_7()
    data class Error(val message: String) : State1548_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
