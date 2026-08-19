package com.awesomeapp.f564ui

sealed class State1925_7 {
    data object Loading : State1925_7()
    data class Success(val data: String) : State1925_7()
    data class Error(val message: String) : State1925_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
