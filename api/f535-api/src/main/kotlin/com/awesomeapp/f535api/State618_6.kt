package com.awesomeapp.f535api

sealed class State618_6 {
    data object Loading : State618_6()
    data class Success(val data: String) : State618_6()
    data class Error(val message: String) : State618_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
