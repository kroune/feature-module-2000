package com.awesomeapp.f463api

sealed class State546_6 {
    data object Loading : State546_6()
    data class Success(val data: String) : State546_6()
    data class Error(val message: String) : State546_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
