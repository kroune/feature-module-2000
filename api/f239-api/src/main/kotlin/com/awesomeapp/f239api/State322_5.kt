package com.awesomeapp.f239api

sealed class State322_5 {
    data object Loading : State322_5()
    data class Success(val data: String) : State322_5()
    data class Error(val message: String) : State322_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
