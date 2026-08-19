package com.awesomeapp.f627api

sealed class State710_10 {
    data object Loading : State710_10()
    data class Success(val data: String) : State710_10()
    data class Error(val message: String) : State710_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
