package com.awesomeapp.f517api

sealed class State600_10 {
    data object Loading : State600_10()
    data class Success(val data: String) : State600_10()
    data class Error(val message: String) : State600_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
