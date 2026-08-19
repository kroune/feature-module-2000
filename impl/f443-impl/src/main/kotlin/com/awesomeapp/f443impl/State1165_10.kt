package com.awesomeapp.f443impl

sealed class State1165_10 {
    data object Loading : State1165_10()
    data class Success(val data: String) : State1165_10()
    data class Error(val message: String) : State1165_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
