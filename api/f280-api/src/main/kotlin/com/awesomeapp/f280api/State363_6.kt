package com.awesomeapp.f280api

sealed class State363_6 {
    data object Loading : State363_6()
    data class Success(val data: String) : State363_6()
    data class Error(val message: String) : State363_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
