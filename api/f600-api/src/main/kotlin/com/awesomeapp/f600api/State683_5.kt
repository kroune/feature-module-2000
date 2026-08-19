package com.awesomeapp.f600api

sealed class State683_5 {
    data object Loading : State683_5()
    data class Success(val data: String) : State683_5()
    data class Error(val message: String) : State683_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
