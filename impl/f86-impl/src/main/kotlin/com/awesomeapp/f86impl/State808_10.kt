package com.awesomeapp.f86impl

sealed class State808_10 {
    data object Loading : State808_10()
    data class Success(val data: String) : State808_10()
    data class Error(val message: String) : State808_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
