package com.awesomeapp.f127ui

sealed class State1488_7 {
    data object Loading : State1488_7()
    data class Success(val data: String) : State1488_7()
    data class Error(val message: String) : State1488_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
