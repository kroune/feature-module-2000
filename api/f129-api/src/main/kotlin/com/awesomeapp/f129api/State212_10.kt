package com.awesomeapp.f129api

sealed class State212_10 {
    data object Loading : State212_10()
    data class Success(val data: String) : State212_10()
    data class Error(val message: String) : State212_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
