package com.awesomeapp.f354api

sealed class State437_5 {
    data object Loading : State437_5()
    data class Success(val data: String) : State437_5()
    data class Error(val message: String) : State437_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
