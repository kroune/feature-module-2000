package com.awesomeapp.f402api

sealed class State485_10 {
    data object Loading : State485_10()
    data class Success(val data: String) : State485_10()
    data class Error(val message: String) : State485_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
