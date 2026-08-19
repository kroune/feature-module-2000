package com.awesomeapp.f369api

sealed class State452_10 {
    data object Loading : State452_10()
    data class Success(val data: String) : State452_10()
    data class Error(val message: String) : State452_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
