package com.awesomeapp.f351api

sealed class State434_8 {
    data object Loading : State434_8()
    data class Success(val data: String) : State434_8()
    data class Error(val message: String) : State434_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
