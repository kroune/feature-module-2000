package com.awesomeapp.f267api

sealed class State350_7 {
    data object Loading : State350_7()
    data class Success(val data: String) : State350_7()
    data class Error(val message: String) : State350_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
