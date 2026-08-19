package com.awesomeapp.f282api

sealed class State365_7 {
    data object Loading : State365_7()
    data class Success(val data: String) : State365_7()
    data class Error(val message: String) : State365_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
