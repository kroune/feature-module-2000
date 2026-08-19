package com.awesomeapp.f489ui

sealed class State1850_10 {
    data object Loading : State1850_10()
    data class Success(val data: String) : State1850_10()
    data class Error(val message: String) : State1850_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
