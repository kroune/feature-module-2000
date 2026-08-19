package com.awesomeapp.f355api

sealed class State438_6 {
    data object Loading : State438_6()
    data class Success(val data: String) : State438_6()
    data class Error(val message: String) : State438_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
