package com.awesomeapp.f173api

sealed class State256_10 {
    data object Loading : State256_10()
    data class Success(val data: String) : State256_10()
    data class Error(val message: String) : State256_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
