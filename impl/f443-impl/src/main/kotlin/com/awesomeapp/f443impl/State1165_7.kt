package com.awesomeapp.f443impl

sealed class State1165_7 {
    data object Loading : State1165_7()
    data class Success(val data: String) : State1165_7()
    data class Error(val message: String) : State1165_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
