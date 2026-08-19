package com.awesomeapp.f548impl

sealed class State1270_10 {
    data object Loading : State1270_10()
    data class Success(val data: String) : State1270_10()
    data class Error(val message: String) : State1270_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
