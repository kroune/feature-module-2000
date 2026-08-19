package com.awesomeapp.f583ui

sealed class State1944_10 {
    data object Loading : State1944_10()
    data class Success(val data: String) : State1944_10()
    data class Error(val message: String) : State1944_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
