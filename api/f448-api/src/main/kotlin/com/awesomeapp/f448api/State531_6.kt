package com.awesomeapp.f448api

sealed class State531_6 {
    data object Loading : State531_6()
    data class Success(val data: String) : State531_6()
    data class Error(val message: String) : State531_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
