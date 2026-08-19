package com.awesomeapp.f137impl

sealed class State859_5 {
    data object Loading : State859_5()
    data class Success(val data: String) : State859_5()
    data class Error(val message: String) : State859_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
