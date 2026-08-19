package com.awesomeapp.f582api

sealed class State665_10 {
    data object Loading : State665_10()
    data class Success(val data: String) : State665_10()
    data class Error(val message: String) : State665_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
