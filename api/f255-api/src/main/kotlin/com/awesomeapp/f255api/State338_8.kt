package com.awesomeapp.f255api

sealed class State338_8 {
    data object Loading : State338_8()
    data class Success(val data: String) : State338_8()
    data class Error(val message: String) : State338_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
