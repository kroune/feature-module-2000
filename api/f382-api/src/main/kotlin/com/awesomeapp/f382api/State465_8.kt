package com.awesomeapp.f382api

sealed class State465_8 {
    data object Loading : State465_8()
    data class Success(val data: String) : State465_8()
    data class Error(val message: String) : State465_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
