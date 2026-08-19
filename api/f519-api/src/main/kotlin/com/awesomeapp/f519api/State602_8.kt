package com.awesomeapp.f519api

sealed class State602_8 {
    data object Loading : State602_8()
    data class Success(val data: String) : State602_8()
    data class Error(val message: String) : State602_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
