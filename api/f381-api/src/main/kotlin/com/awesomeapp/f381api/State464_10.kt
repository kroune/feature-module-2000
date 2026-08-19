package com.awesomeapp.f381api

sealed class State464_10 {
    data object Loading : State464_10()
    data class Success(val data: String) : State464_10()
    data class Error(val message: String) : State464_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
