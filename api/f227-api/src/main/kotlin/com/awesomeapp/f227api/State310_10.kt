package com.awesomeapp.f227api

sealed class State310_10 {
    data object Loading : State310_10()
    data class Success(val data: String) : State310_10()
    data class Error(val message: String) : State310_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
