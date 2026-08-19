package com.awesomeapp.f447api

sealed class State530_7 {
    data object Loading : State530_7()
    data class Success(val data: String) : State530_7()
    data class Error(val message: String) : State530_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
