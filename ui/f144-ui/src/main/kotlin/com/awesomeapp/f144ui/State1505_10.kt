package com.awesomeapp.f144ui

sealed class State1505_10 {
    data object Loading : State1505_10()
    data class Success(val data: String) : State1505_10()
    data class Error(val message: String) : State1505_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
