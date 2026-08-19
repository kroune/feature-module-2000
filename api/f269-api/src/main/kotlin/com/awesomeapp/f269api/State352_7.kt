package com.awesomeapp.f269api

sealed class State352_7 {
    data object Loading : State352_7()
    data class Success(val data: String) : State352_7()
    data class Error(val message: String) : State352_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
