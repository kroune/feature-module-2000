package com.awesomeapp.f569ui

sealed class State1930_10 {
    data object Loading : State1930_10()
    data class Success(val data: String) : State1930_10()
    data class Error(val message: String) : State1930_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
