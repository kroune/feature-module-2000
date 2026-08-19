package com.awesomeapp.f492api

sealed class State575_10 {
    data object Loading : State575_10()
    data class Success(val data: String) : State575_10()
    data class Error(val message: String) : State575_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
