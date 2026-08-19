package com.awesomeapp.f329api

sealed class State412_7 {
    data object Loading : State412_7()
    data class Success(val data: String) : State412_7()
    data class Error(val message: String) : State412_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
