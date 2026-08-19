package com.awesomeapp.f486api

sealed class State569_5 {
    data object Loading : State569_5()
    data class Success(val data: String) : State569_5()
    data class Error(val message: String) : State569_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
