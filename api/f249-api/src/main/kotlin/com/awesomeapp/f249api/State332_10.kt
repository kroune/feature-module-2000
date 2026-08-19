package com.awesomeapp.f249api

sealed class State332_10 {
    data object Loading : State332_10()
    data class Success(val data: String) : State332_10()
    data class Error(val message: String) : State332_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
