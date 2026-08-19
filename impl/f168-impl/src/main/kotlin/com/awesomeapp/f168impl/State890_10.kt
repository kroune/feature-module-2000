package com.awesomeapp.f168impl

sealed class State890_10 {
    data object Loading : State890_10()
    data class Success(val data: String) : State890_10()
    data class Error(val message: String) : State890_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
