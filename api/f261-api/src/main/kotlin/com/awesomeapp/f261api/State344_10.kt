package com.awesomeapp.f261api

sealed class State344_10 {
    data object Loading : State344_10()
    data class Success(val data: String) : State344_10()
    data class Error(val message: String) : State344_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
