package com.awesomeapp.f535ui

sealed class State1896_10 {
    data object Loading : State1896_10()
    data class Success(val data: String) : State1896_10()
    data class Error(val message: String) : State1896_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
