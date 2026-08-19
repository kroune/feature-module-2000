package com.awesomeapp.f253api

sealed class State336_8 {
    data object Loading : State336_8()
    data class Success(val data: String) : State336_8()
    data class Error(val message: String) : State336_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
