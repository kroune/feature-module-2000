package com.awesomeapp.f337api

sealed class State420_10 {
    data object Loading : State420_10()
    data class Success(val data: String) : State420_10()
    data class Error(val message: String) : State420_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
