package com.awesomeapp.f153impl

sealed class State875_10 {
    data object Loading : State875_10()
    data class Success(val data: String) : State875_10()
    data class Error(val message: String) : State875_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
