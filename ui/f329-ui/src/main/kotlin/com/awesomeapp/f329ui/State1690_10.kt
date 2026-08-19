package com.awesomeapp.f329ui

sealed class State1690_10 {
    data object Loading : State1690_10()
    data class Success(val data: String) : State1690_10()
    data class Error(val message: String) : State1690_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
