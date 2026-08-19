package com.awesomeapp.f235api

sealed class State318_6 {
    data object Loading : State318_6()
    data class Success(val data: String) : State318_6()
    data class Error(val message: String) : State318_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
