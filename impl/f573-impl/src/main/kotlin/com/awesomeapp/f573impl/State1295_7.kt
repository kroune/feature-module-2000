package com.awesomeapp.f573impl

sealed class State1295_7 {
    data object Loading : State1295_7()
    data class Success(val data: String) : State1295_7()
    data class Error(val message: String) : State1295_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
