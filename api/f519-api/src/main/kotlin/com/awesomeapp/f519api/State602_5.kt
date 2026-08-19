package com.awesomeapp.f519api

sealed class State602_5 {
    data object Loading : State602_5()
    data class Success(val data: String) : State602_5()
    data class Error(val message: String) : State602_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
