package com.awesomeapp.f542api

sealed class State625_10 {
    data object Loading : State625_10()
    data class Success(val data: String) : State625_10()
    data class Error(val message: String) : State625_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
