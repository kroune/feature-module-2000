package com.awesomeapp.f140api

sealed class State223_8 {
    data object Loading : State223_8()
    data class Success(val data: String) : State223_8()
    data class Error(val message: String) : State223_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
