package com.awesomeapp.f513api

sealed class State596_10 {
    data object Loading : State596_10()
    data class Success(val data: String) : State596_10()
    data class Error(val message: String) : State596_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
