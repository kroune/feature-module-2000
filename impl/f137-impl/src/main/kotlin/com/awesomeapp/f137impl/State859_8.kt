package com.awesomeapp.f137impl

sealed class State859_8 {
    data object Loading : State859_8()
    data class Success(val data: String) : State859_8()
    data class Error(val message: String) : State859_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
