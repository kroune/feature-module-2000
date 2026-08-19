package com.awesomeapp.f602api

sealed class State685_10 {
    data object Loading : State685_10()
    data class Success(val data: String) : State685_10()
    data class Error(val message: String) : State685_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
