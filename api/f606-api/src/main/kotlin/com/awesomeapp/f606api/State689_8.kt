package com.awesomeapp.f606api

sealed class State689_8 {
    data object Loading : State689_8()
    data class Success(val data: String) : State689_8()
    data class Error(val message: String) : State689_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
