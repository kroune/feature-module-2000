package com.awesomeapp.f522api

sealed class State605_7 {
    data object Loading : State605_7()
    data class Success(val data: String) : State605_7()
    data class Error(val message: String) : State605_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
