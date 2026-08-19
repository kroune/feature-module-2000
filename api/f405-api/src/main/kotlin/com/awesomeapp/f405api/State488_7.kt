package com.awesomeapp.f405api

sealed class State488_7 {
    data object Loading : State488_7()
    data class Success(val data: String) : State488_7()
    data class Error(val message: String) : State488_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
