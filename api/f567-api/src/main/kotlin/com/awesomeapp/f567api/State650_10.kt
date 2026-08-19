package com.awesomeapp.f567api

sealed class State650_10 {
    data object Loading : State650_10()
    data class Success(val data: String) : State650_10()
    data class Error(val message: String) : State650_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
