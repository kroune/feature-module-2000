package com.awesomeapp.f164ui

sealed class State1525_10 {
    data object Loading : State1525_10()
    data class Success(val data: String) : State1525_10()
    data class Error(val message: String) : State1525_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
