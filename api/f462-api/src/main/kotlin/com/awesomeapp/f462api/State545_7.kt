package com.awesomeapp.f462api

sealed class State545_7 {
    data object Loading : State545_7()
    data class Success(val data: String) : State545_7()
    data class Error(val message: String) : State545_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
