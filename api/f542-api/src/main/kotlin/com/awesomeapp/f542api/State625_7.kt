package com.awesomeapp.f542api

sealed class State625_7 {
    data object Loading : State625_7()
    data class Success(val data: String) : State625_7()
    data class Error(val message: String) : State625_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
