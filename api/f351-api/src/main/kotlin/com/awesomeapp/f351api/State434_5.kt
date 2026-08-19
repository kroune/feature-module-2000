package com.awesomeapp.f351api

sealed class State434_5 {
    data object Loading : State434_5()
    data class Success(val data: String) : State434_5()
    data class Error(val message: String) : State434_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
