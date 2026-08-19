package com.awesomeapp.f423api

sealed class State506_5 {
    data object Loading : State506_5()
    data class Success(val data: String) : State506_5()
    data class Error(val message: String) : State506_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
