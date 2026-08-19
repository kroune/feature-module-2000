package com.awesomeapp.f6impl

sealed class State728_10 {
    data object Loading : State728_10()
    data class Success(val data: String) : State728_10()
    data class Error(val message: String) : State728_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
