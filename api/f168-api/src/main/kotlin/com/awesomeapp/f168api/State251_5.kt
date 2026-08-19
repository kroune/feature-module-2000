package com.awesomeapp.f168api

sealed class State251_5 {
    data object Loading : State251_5()
    data class Success(val data: String) : State251_5()
    data class Error(val message: String) : State251_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
