package com.awesomeapp.f273api

sealed class State356_10 {
    data object Loading : State356_10()
    data class Success(val data: String) : State356_10()
    data class Error(val message: String) : State356_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
