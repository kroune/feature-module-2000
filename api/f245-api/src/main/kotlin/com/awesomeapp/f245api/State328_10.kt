package com.awesomeapp.f245api

sealed class State328_10 {
    data object Loading : State328_10()
    data class Success(val data: String) : State328_10()
    data class Error(val message: String) : State328_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
