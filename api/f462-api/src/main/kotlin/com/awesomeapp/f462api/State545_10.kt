package com.awesomeapp.f462api

sealed class State545_10 {
    data object Loading : State545_10()
    data class Success(val data: String) : State545_10()
    data class Error(val message: String) : State545_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
