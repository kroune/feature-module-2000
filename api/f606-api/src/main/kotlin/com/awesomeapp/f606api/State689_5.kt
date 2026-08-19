package com.awesomeapp.f606api

sealed class State689_5 {
    data object Loading : State689_5()
    data class Success(val data: String) : State689_5()
    data class Error(val message: String) : State689_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
