package com.awesomeapp.f239api

sealed class State322_8 {
    data object Loading : State322_8()
    data class Success(val data: String) : State322_8()
    data class Error(val message: String) : State322_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
