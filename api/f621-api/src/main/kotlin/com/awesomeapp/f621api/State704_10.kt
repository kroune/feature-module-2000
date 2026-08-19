package com.awesomeapp.f621api

sealed class State704_10 {
    data object Loading : State704_10()
    data class Success(val data: String) : State704_10()
    data class Error(val message: String) : State704_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
