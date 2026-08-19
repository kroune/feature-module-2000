package com.awesomeapp.f354api

sealed class State437_8 {
    data object Loading : State437_8()
    data class Success(val data: String) : State437_8()
    data class Error(val message: String) : State437_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
