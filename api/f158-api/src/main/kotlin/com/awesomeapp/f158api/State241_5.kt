package com.awesomeapp.f158api

sealed class State241_5 {
    data object Loading : State241_5()
    data class Success(val data: String) : State241_5()
    data class Error(val message: String) : State241_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
