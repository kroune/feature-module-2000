package com.awesomeapp.f422api

sealed class State505_10 {
    data object Loading : State505_10()
    data class Success(val data: String) : State505_10()
    data class Error(val message: String) : State505_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
