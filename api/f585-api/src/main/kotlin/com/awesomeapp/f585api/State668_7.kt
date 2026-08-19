package com.awesomeapp.f585api

sealed class State668_7 {
    data object Loading : State668_7()
    data class Success(val data: String) : State668_7()
    data class Error(val message: String) : State668_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
