package com.awesomeapp.f104ui

sealed class State1465_7 {
    data object Loading : State1465_7()
    data class Success(val data: String) : State1465_7()
    data class Error(val message: String) : State1465_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
