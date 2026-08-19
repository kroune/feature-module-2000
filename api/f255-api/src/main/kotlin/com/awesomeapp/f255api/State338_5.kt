package com.awesomeapp.f255api

sealed class State338_5 {
    data object Loading : State338_5()
    data class Success(val data: String) : State338_5()
    data class Error(val message: String) : State338_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
