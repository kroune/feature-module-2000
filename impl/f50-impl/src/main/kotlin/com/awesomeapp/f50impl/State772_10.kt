package com.awesomeapp.f50impl

sealed class State772_10 {
    data object Loading : State772_10()
    data class Success(val data: String) : State772_10()
    data class Error(val message: String) : State772_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
