package com.awesomeapp.f407api

sealed class State490_10 {
    data object Loading : State490_10()
    data class Success(val data: String) : State490_10()
    data class Error(val message: String) : State490_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
