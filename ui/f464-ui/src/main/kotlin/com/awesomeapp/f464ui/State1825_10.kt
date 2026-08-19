package com.awesomeapp.f464ui

sealed class State1825_10 {
    data object Loading : State1825_10()
    data class Success(val data: String) : State1825_10()
    data class Error(val message: String) : State1825_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
