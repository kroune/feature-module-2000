package com.awesomeapp.f452api

sealed class State535_7 {
    data object Loading : State535_7()
    data class Success(val data: String) : State535_7()
    data class Error(val message: String) : State535_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
