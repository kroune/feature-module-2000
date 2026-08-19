package com.awesomeapp.f238api

sealed class State321_6 {
    data object Loading : State321_6()
    data class Success(val data: String) : State321_6()
    data class Error(val message: String) : State321_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
