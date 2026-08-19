package com.awesomeapp.f346api

sealed class State429_6 {
    data object Loading : State429_6()
    data class Success(val data: String) : State429_6()
    data class Error(val message: String) : State429_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
