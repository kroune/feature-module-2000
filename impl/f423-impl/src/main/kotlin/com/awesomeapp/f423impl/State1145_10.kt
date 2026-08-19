package com.awesomeapp.f423impl

sealed class State1145_10 {
    data object Loading : State1145_10()
    data class Success(val data: String) : State1145_10()
    data class Error(val message: String) : State1145_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
