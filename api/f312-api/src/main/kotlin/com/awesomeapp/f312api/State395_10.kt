package com.awesomeapp.f312api

sealed class State395_10 {
    data object Loading : State395_10()
    data class Success(val data: String) : State395_10()
    data class Error(val message: String) : State395_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
