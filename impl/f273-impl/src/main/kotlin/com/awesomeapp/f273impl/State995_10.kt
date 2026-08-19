package com.awesomeapp.f273impl

sealed class State995_10 {
    data object Loading : State995_10()
    data class Success(val data: String) : State995_10()
    data class Error(val message: String) : State995_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
