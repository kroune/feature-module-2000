package com.awesomeapp.f432api

sealed class State515_10 {
    data object Loading : State515_10()
    data class Success(val data: String) : State515_10()
    data class Error(val message: String) : State515_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
