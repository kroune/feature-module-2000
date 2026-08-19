package com.awesomeapp.f633api

sealed class State716_10 {
    data object Loading : State716_10()
    data class Success(val data: String) : State716_10()
    data class Error(val message: String) : State716_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
