package com.awesomeapp.f269api

sealed class State352_10 {
    data object Loading : State352_10()
    data class Success(val data: String) : State352_10()
    data class Error(val message: String) : State352_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
