package com.awesomeapp.f266impl

sealed class State988_10 {
    data object Loading : State988_10()
    data class Success(val data: String) : State988_10()
    data class Error(val message: String) : State988_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
